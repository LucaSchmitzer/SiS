package com.kaufland.sis.controller.global;


import com.kaufland.sis.persistence.school.Student;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class ModelAttributes {

    private Student student = new Student();

    @ModelAttribute("student")
    public Student student(){
        return student;
    }


}
