package tw.codedata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DvdController {
    /*private DvdLibraryService dvdLibraryService;

    @Autowired
    public void setDvdLibraryService(DvdLibraryService dvdLibraryService) {
        this.dvdLibraryService = dvdLibraryService;
    }*/
         
    public DvdLibraryService getDvdLibraryService() {
        return dvdLibraryService;
    }
    
    @RequestMapping("list")
    public String list(Model m) {
        // fill code
        return "list";
    }
    
    @RequestMapping("add")
    public String add(
            @RequestParam("title") String title, 
            @RequestParam("year") Integer year,
            @RequestParam("duration") Integer duration,
            @RequestParam("director") String director,
            Model m) {
        /*
            fill code 
        */
        return "success";
    }
}
