package com.hef.marco.controller;

import com.hef.marco.domain.Spitter;
import com.hef.marco.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Date 2019-05-01
 * @Author lifei
 */
@Controller
@RequestMapping(value = "/spitterController")
public class SpitterController {

    @Autowired
    private SpitterService spitterService;
    @RequestMapping(value = "/spitter", method = RequestMethod.GET)
    public String spitter(Model model){
        Spitter spitter = spitterService.findRandomSpitter();
        model.addAttribute(spitter);
        return "profile";
    }

}
