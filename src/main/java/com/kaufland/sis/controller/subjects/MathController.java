package com.kaufland.sis.controller.subjects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MathController {

    private static final String URL = "/subjects/math";

    @GetMapping(URL)
    public String getMapping() {
        return URL;
    }

    @PostMapping(URL)
    public String submit() {
        return "redirect:" + URL;
    }
}
