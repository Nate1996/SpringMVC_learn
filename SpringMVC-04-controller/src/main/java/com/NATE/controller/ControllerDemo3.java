package com.NATE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/d3")
public class ControllerDemo3 {

    @RequestMapping("/d")
    public String demo3(Model model){
        model.addAttribute("msg","ControllerDemo3");
        return "test";
    }
}
