package com.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public ModelAndView go(HttpSession httpSession) {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
