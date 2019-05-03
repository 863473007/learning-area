package com.hef.spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Date 2019-05-02
 * @Author lifei
 */
@Controller
@RequestMapping(value = {"/", "/home"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
