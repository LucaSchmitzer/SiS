package com.kaufland.sis.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class WeController {

    private static final String URL = "/we";

    @GetMapping(URL)
    public String getMe() {
        return URL;
    }
}
