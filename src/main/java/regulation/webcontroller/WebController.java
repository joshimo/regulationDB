package regulation.webcontroller;

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

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller
public class WebController {

    Model model;

    @Resource(name = "springDBController")
    private SpringDBController springDBController;

    List<DocumentHeader> headers;

    @RequestMapping(value = "/regulation", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newdocument() {
        return "/newdocument";
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
        model.addAttribute("header", header);
        return "/details";
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public String result(Model model) throws Exception {
        headers = springDBController.getAllDocumentHeaders();
        model.addAttribute("headers", headers);
        return "resultpage";
    }

}