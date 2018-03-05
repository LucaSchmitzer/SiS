package com.kaufland.sis.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class IndexController {

    private static final String URL = "/index";

    @GetMapping("/index")
    public String getIndex() {
        return URL;
    }


}
