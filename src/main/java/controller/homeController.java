package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHome(Model model){

        model.addAttribute("test","테스트 중 입니다.");

        return "home";
    }
}
