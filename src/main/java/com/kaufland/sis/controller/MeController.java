package com.kaufland.sis.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Scope("session")
public class MeController {

    private static final String URL = "/We";

    @GetMapping(URL)
    public String getMe() {
        return URL;
    }
}
