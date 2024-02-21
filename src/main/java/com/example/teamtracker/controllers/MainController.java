package com.example.teamtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "main";
    }

    @GetMapping ("/about")
    public String about(Model model){
        model.addAttribute("title", "Головна про насс");
        return "about";
    }

}
