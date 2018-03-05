package com.kaufland.sis.controller.global;


import com.kaufland.sis.persistence.school.Student;
import com.kaufland.sis.persistence.school.Subjects;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.security.auth.Subject;

@ControllerAdvice
public class ModelAttributes {

    private Student student = new Student();

    private Subjects subject = new Subjects();

    @ModelAttribute("student")
    public Student student(){
        return student;
    }

    @ModelAttribute("subject")
    public Subjects subject(){
        return subject;
    }


}
