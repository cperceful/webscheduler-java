package com.cperceful.webschedulerjava.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    public String index(Model model){
        model.addAttribute("title", "Select functionality to test");
        return "index/index";
    }
}
