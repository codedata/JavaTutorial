package tw.codedata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorld {
    @RequestMapping("hello")
    public String hello(@RequestParam("user") String user, Model m) {
        m.addAttribute("user", user);
        return "hello";
    }
}
