package regulation.webcontroller;

import org.springframework.http.HttpHeaders;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import regulation.config.RegulationConfig;
import regulation.datamodel.*;
import regulation.entity_controller.Filter;
import regulation.entity_controller.SpringDBController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import regulation.entity_controller.exceptions.DuplicationDataException;
import regulation.entity_controller.exceptions.InvalidDataException;
import regulation.file_controller.IOController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class WebController {

    @Resource(name="regulationConfig")
    private RegulationConfig config;

    @Resource(name = "udfMapping")
    private UDFMapping udfMapping = UDFMapping.getInstance();

    @Resource(name = "springDBController")
    private SpringDBController springDBController;

    @Resource(name = "fileController")
    private IOController fileController;

    @Resource(name = "filter")
    private Filter filter;

    List<DocHeader> headers;
    List<DocHeader> filteredHeaders;

    private String userName = "";
    private String userPassword = "";

    @RequestMapping(value = "/regulation", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("departmentName", config.getDepartmentName());
        return "index";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String auth(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
        System.out.println(userName);
        System.out.println(userPassword);
        return "index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newdocument(Model model) {
        model.addAttribute("udfMapping", udfMapping);
        if (! (userName.equals(config.getAdminName()) && userPassword.equals(config.getAdminPassword())))
            return "autenthification";
        else
            return "newform";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editDocument(Model model, Integer id) throws Exception {
        if (! (userName.equals(config.getAdminName()) && userPassword.equals(config.getAdminPassword())))
            return "autenthification";
        else {
            DocContainer hdr = springDBController.getDocumentByID(DocContainer.class, id);
            model.addAttribute("udfMapping", udfMapping);
            model.addAttribute("hdr", hdr);
            return "editform";
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDocument(DocHeader edited) throws Exception {
        DocHeader header = springDBController.getDocumentByID(DocHeader.class, edited.getDocNum());
        header.setDocName(edited.getDocName());
        header.setDocType(edited.getDocType());
        header.setDocDescription(edited.getDocDescription());
        header.setMandatoryUA(edited.getMandatoryUA());
        header.setMandatoryRU(edited.getMandatoryRU());
        header.setMandatoryRK(edited.getMandatoryRK());
        header.setMandatoryEU(edited.getMandatoryEU());
        header.setUpToDate(edited.getUpToDate());
        header.setUdf01(edited.getUdf01());
        header.setUdf02(edited.getUdf02());
        header.setUdf03(edited.getUdf03());
        header.setUdf04(edited.getUdf04());
        header.setUdf05(edited.getUdf05());
        header.setUdf06(edited.getUdf06());
        header.setUdf07(edited.getUdf07());
        header.setUdf08(edited.getUdf08());
        header.setUdf09(edited.getUdf09());
        header.setUdf10(edited.getUdf10());
        header.setUdf11(edited.getUdf11());
        header.setUdf12(edited.getUdf12());
        header.setUdf13(edited.getUdf13());
        header.setUdf14(edited.getUdf14());
        header.setUdf15(edited.getUdf15());
        header.setUdf16(edited.getUdf16());
        header.setUdf17(edited.getUdf17());
        header.setUdf18(edited.getUdf18());
        header.setUdf19(edited.getUdf19());
        header.setUdf20(edited.getUdf20());
        header.setUdf21(edited.getUdf21());
        header.setUdf22(edited.getUdf22());
        header.setUdf23(edited.getUdf23());
        header.setUdf24(edited.getUdf24());
        header.setUdf25(edited.getUdf25());
        header.setUdf26(edited.getUdf26());
        header.setUdf27(edited.getUdf27());
        header.setUdf28(edited.getUdf28());
        header.setUdf29(edited.getUdf29());
        header.setUdf30(edited.getUdf30());
        header.setUdf31(edited.getUdf31());
        header.setUdf32(edited.getUdf32());
        header.setHashTags(edited.getHashTags());
        header.setNotes(edited.getNotes());
        springDBController.updateDocument(header);
        return "index";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String saveDocument(Integer id) throws Exception {
        System.out.println("Deleting id = " + id);
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createNewDocument(@ModelAttribute("mvc-dispatcher") DocContainer docContainer,
                                    @RequestParam("file") MultipartFile file) throws IOException {
        docContainer.setDocFileName(file.getOriginalFilename());
        docContainer.setDocStream(file.getBytes());
        docContainer.calculateHashSum();
        try {
            springDBController.uploadDocument(docContainer);
        }
        catch (InvalidDataException ide) {
            System.out.println(ide.getMessage());
        }
        catch (DuplicationDataException dde) {
            System.out.println(dde.getMessage());
        }
        return "index";
    }

    @RequestMapping(value = "/showdetails", method = RequestMethod.GET)
    public String showDetails(Model model, Integer id) throws Exception {
        DocHeader header = springDBController.getDocumentByID(DocHeader.class, id);
        model.addAttribute("hdr", header);
        model.addAttribute("udfMapping", udfMapping);
        return "details";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String result(Model model) throws Exception {
        headers = springDBController.getAllDocumentHeaders();
        model.addAttribute("headers", headers);
        return "resultpage";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchGet(Model model) throws Exception {
        model.addAttribute("udfMapping", udfMapping);
        return "searchform";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchPost(Model model, DocHeader mask) throws Exception {
        System.out.println(mask);
        headers = springDBController.getAllDocumentHeaders();
        filteredHeaders = filter.getFilteredDocumentHeaders(mask, headers);
        model.addAttribute("udfMapping", udfMapping);
        model.addAttribute("headers", filteredHeaders);
        return "resultpage";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
        public void download(Integer id, HttpServletRequest request,
                                         HttpServletResponse response) throws Exception {
        DocContainer document = springDBController.getDocumentByID(DocContainer.class, id);
        response.setContentType("application/octet-stream");
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + changeRussianToLatin(document.getDocFileName()));
        response.setContentLength((int) document.getFileSize());
        response.getOutputStream().write(document.getPrimitiveDocStream());
        response.getOutputStream().close();
    }

    private String changeRussianToLatin(String filename) {
        String decodedName;
        decodedName = filename.toLowerCase().replace("а", "a");
        decodedName = decodedName.replace("б", "b");
        decodedName = decodedName.replace("в", "v");
        decodedName = decodedName.replace("г", "g");
        decodedName = decodedName.replace("д", "d");
        decodedName = decodedName.replace("е", "e");
        decodedName = decodedName.replace("ё", "e");
        decodedName = decodedName.replace("ж", "zh");
        decodedName = decodedName.replace("з", "z");
        decodedName = decodedName.replace("и", "i");
        decodedName = decodedName.replace("й", "j");
        decodedName = decodedName.replace("к", "k");
        decodedName = decodedName.replace("л", "l");
        decodedName = decodedName.replace("м", "m");
        decodedName = decodedName.replace("н", "n");
        decodedName = decodedName.replace("о", "o");
        decodedName = decodedName.replace("п", "p");
        decodedName = decodedName.replace("р", "r");
        decodedName = decodedName.replace("с", "s");
        decodedName = decodedName.replace("т", "t");
        decodedName = decodedName.replace("у", "u");
        decodedName = decodedName.replace("ф", "f");
        decodedName = decodedName.replace("х", "h");
        decodedName = decodedName.replace("ц", "ts");
        decodedName = decodedName.replace("ч", "ch");
        decodedName = decodedName.replace("ш", "sh");
        decodedName = decodedName.replace("щ", "sch");
        decodedName = decodedName.replace("ъ", "");
        decodedName = decodedName.replace("ы", "y");
        decodedName = decodedName.replace("ь", "");
        decodedName = decodedName.replace("э", "e");
        decodedName = decodedName.replace("ю", "yu");
        decodedName = decodedName.replace("я", "ya");
        return decodedName;
    }
}