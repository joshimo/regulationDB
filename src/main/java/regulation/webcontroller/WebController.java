package regulation.webcontroller;

import org.springframework.http.HttpHeaders;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import regulation.datamodel.DocumentContainer;
import regulation.datamodel.DocumentHeader;
import regulation.entity_controller.SpringDBController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import regulation.entity_controller.exceptions.DuplicationDataException;
import regulation.entity_controller.exceptions.InvalidDataException;
import regulation.file_controller.IOController;


import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class WebController {

    Model model;

    @Resource(name = "springDBController")
    private SpringDBController springDBController;

    @Resource(name = "fileController")
    private IOController fileController;

    List<DocumentHeader> headers;

    @RequestMapping(value = "/regulation", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newdocument() {
        return "/newdocument";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editDocument(Model model, Integer id) throws Exception {
        DocumentContainer hdr = springDBController.getDocumentByID(DocumentContainer.class, id);
        model.addAttribute("hdr", hdr);
        return "/editpage";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDocument(DocumentHeader edited) throws Exception {
        DocumentHeader header = springDBController.getDocumentByID(DocumentHeader.class, edited.getDocNum());
        header.setDocName(edited.getDocName());
        header.setDocType(edited.getDocType());
        header.setDocDescription(edited.getDocDescription());
        header.setMandatoryUA(edited.getMandatoryUA());
        header.setMandatoryRU(edited.getMandatoryRU());
        header.setMandatoryRK(edited.getMandatoryRK());
        header.setMandatoryEU(edited.getMandatoryEU());
        header.setApplicationGeneral(edited.getApplicationGeneral());
        header.setApplicationMeasurement(edited.getApplicationMeasurement());
        header.setApplicationInstrumentation(edited.getApplicationInstrumentation());
        header.setApplicationSafety(edited.getApplicationSafety());
        header.setApplicationASUTP(edited.getApplicationASUTP());
        header.setApplicationProcess(edited.getApplicationProcess());
        header.setApplicationPiping(edited.getApplicationPiping());
        header.setApplicationElectrical(edited.getApplicationElectrical());
        header.setApplicationConstruction(edited.getApplicationSafety());
        header.setApplicationCableRouting(edited.getApplicationCableRouting());
        header.setApplicationPID(edited.getApplicationPID());
        header.setApplicationSPDS(edited.getApplicationSPDS());
        header.setApplicationDocumentDesign(edited.getApplicationDocumentDesign());
        header.setApplicationForInformation(edited.getApplicationForInformation());
        header.setApplicationSTP(edited.getApplicationSTP());
        header.setHashTag01(edited.getHashTag01());
        header.setHashTag02(edited.getHashTag02());
        header.setHashTag03(edited.getHashTag03());
        header.setHashTag04(edited.getHashTag04());
        header.setHashTag05(edited.getHashTag05());
        header.setHashTag06(edited.getHashTag06());
        header.setNotes(edited.getNotes());
        springDBController.updateDocument(header);
        return "/index";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String saveDocument(Integer id) throws Exception {
        System.out.println("Deleting id = " + id);
        return "/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createNewDocument(@ModelAttribute("mvc-dispatcher") DocumentContainer documentContainer,
                                    @RequestParam("file") MultipartFile file) throws IOException {

        documentContainer.setDocFileName(file.getOriginalFilename());
        documentContainer.setDocStream(file.getBytes());
        documentContainer.calculateHashSum();
        try {
            springDBController.uploadDocument(documentContainer);
        }
        catch (InvalidDataException ide) {
            System.out.println(ide.getMessage());
        }
        catch (DuplicationDataException dde) {
            System.out.println(dde.getMessage());
        }
        return "/index";
    }

    @RequestMapping(value = "/showdetails", method = RequestMethod.GET)
    public String showDetails(Model model, Integer id) throws Exception {
        DocumentHeader header = springDBController.getDocumentByID(DocumentHeader.class, id);
        model.addAttribute("hdr", header);
        return "/details";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String result(Model model) throws Exception {
        headers = springDBController.getAllDocumentHeaders();
        model.addAttribute("headers", headers);
        return "/resultpage";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
        public void download(Integer id, HttpServletRequest request,
                                         HttpServletResponse response) throws Exception {

        DocumentContainer document = springDBController.getDocumentByID(DocumentContainer.class, id);

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