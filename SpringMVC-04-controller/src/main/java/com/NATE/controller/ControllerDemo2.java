package com.NATE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class ControllerDemo2 {

    //映射访问路径
    @RequestMapping("/d2")
    public String test1(Model model){
        model.addAttribute("msg","ControllerDemo2");
        //返回视图位置
        return "test";

    }
}
