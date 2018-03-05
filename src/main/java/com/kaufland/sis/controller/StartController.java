package com.kaufland.sis.controller;

import com.kaufland.sis.doamin.StudentService;
import com.kaufland.sis.persistence.school.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Scope("session")
public class StartController {

    private static final String URL = "/start";

    @Autowired
    StudentService studentService;

    @GetMapping(URL)
    public String getStart() {
        return URL;
    }

    @PostMapping(URL)
    public String buttonStartClicked(@ModelAttribute Student student) {
        checkVarAvailability(student);
        return "redirect:" + "/index";
    }

    private void checkVarAvailability(Student student) {
        studentService.checkAvailability(student);
    }

}
