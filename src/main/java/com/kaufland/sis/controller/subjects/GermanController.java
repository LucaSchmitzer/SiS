package com.kaufland.sis.controller.subjects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GermanController {

    private static final String URL = "/subjects/german";

    @GetMapping(URL)
    public String getMapping() {
        return URL;
    }

    @PostMapping(URL)
    public String submit() {
        return "redirect:" + URL;
    }

}
