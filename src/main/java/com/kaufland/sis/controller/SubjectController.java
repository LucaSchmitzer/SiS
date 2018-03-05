package com.kaufland.sis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {

    private static final String URL = "/subjects";

    @GetMapping
    public String getMapping (){
        return URL;
    }
}
