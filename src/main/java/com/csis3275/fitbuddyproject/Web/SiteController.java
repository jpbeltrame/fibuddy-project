package com.csis3275.fitbuddyproject.Web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class SiteController {

    @GetMapping(path = "/")
    public String IndexPageLoader(Model model) {
        model.addAttribute("page", "main");
        return "site/main";
    }

    @GetMapping(path = "/about")
    public String AboutPageLoader(Model model) {
        model.addAttribute("page", "about");
        return "site/about";
    }

    @GetMapping(path = "/support")
    public String SupportPageLoader(Model model) {
        model.addAttribute("page", "support");
        return "site/support";
    }

    @GetMapping(path = "/eula")
    public String EULAPageLoader(Model model) {
        model.addAttribute("page", "eula");
        return "site/eula";
    }
}
