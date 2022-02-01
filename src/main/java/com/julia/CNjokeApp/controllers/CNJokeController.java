package com.julia.CNjokeApp.controllers;

import com.julia.CNjokeApp.services.CNJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CNJokeController {
    private final CNJokeService cnJokeService;

    public CNJokeController(CNJokeService cnJokeService) {
        this.cnJokeService = cnJokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", cnJokeService.getAJoke());
        return "index";
    }
}
