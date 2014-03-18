package tw.codedata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DvdController {
    private DvdDao DvdDao;
   
    @Autowired
    public void setDvdDao(DvdDao DvdDao) {
        this.DvdDao = DvdDao;
    }
    
    public DvdDao getDvdDao() {
        return DvdDao;
    }
    
    @RequestMapping("list")
    public String list(Model m) {
        m.addAttribute("dvds", getDvdDao().allDvds());
        return "list";
    }
    
    @RequestMapping("add")
    public String add(
            @RequestParam("title") String title, 
            @RequestParam("year") Integer year,
            @RequestParam("duration") Integer duration,
            @RequestParam("director") String director,
            Model m) {
        Dvd dvd = new Dvd(title, year, duration, new Director(director));
        getDvdDao().saveDvd(dvd);
        m.addAttribute("dvd", dvd);
        return "success";
    }
}
