package com.kaufland.sis.controller.global;


import com.kaufland.sis.persistence.school.students.Student;
import com.kaufland.sis.persistence.school.subject.Subjects;
import com.kaufland.sis.persistence.school.subject.subjects.ComputerScience;
import com.kaufland.sis.persistence.school.subject.subjects.German;
import com.kaufland.sis.persistence.school.subject.subjects.Math;
import com.kaufland.sis.persistence.school.subject.subjects.Physics;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ModelAttributes {

    private Student student = new Student();

    private Subjects subject = new Subjects();

    private List<Subjects> subjectsList = new ArrayList<>();

    private List<Subjects> getAllSubs(){
        German german = new German("The german language", "German", "Header", "Lernen");

        Math math = new Math("Mathematics", "Math", "Header", "Lernen");

        Physics physics = new Physics("Physics", "Physics", "Header", "");

        ComputerScience computerScience = new ComputerScience("Information Technology", "IT", "<Header>", "Develop");

        subjectsList.add(german);
        subjectsList.add(math);
        subjectsList.add(physics);
        subjectsList.add(computerScience);
        return subjectsList;
    }

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
        subjectsList = getAllSubs();
        return subjectsList;
    }

}
