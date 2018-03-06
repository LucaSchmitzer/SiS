package com.kaufland.sis.controller.subjects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComputerScienceController {

    private static final String URL = "/subject/computer_science";

    @GetMapping(URL)
    public String getMapping() {
        return URL;
    }

}
