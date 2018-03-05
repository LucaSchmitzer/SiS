package com.kaufland.sis.controller.global;


import com.kaufland.sis.persistence.school.Student;
import com.kaufland.sis.persistence.school.Subjects;
import com.kaufland.sis.persistence.school.subjects.ComputerScience;
import com.kaufland.sis.persistence.school.subjects.German;
import com.kaufland.sis.persistence.school.subjects.Math;
import com.kaufland.sis.persistence.school.subjects.Physics;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ModelAttributes {

    private Student student = new Student();

    private Subjects subject = new Subjects();

    private German german = new German();

    private Math math = new Math();

    private Physics physics = new Physics();

    private ComputerScience computerScience = new ComputerScience();

    private List<Subjects> subjectsList = new ArrayList<>();

    @ModelAttribute("student")
    public Student student(){
        return student;
    }

    @ModelAttribute("subject")
    public Subjects subject(){
        return subject;
    }

    @ModelAttribute("subjectList")
    public List<Subjects> subjects(){
        return subjectsList;
    }


}
