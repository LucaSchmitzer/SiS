package com.kaufland.sis.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class AboutController {

    private static final String URL = "/about";

    @GetMapping(URL)
    public String getAbout(){
        return URL;
    }

}
