package com.dvtiaret.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String goHome(){
        return "home";
    }

    @RequestMapping("/new")
    public String goNew(){
        return "new";
    }

    @RequestMapping("/edit")
    public String goEdit(){
        return "edit";
    }

    @RequestMapping("/delete")
    public String goDelete(){
        return "delete";
    }
}
