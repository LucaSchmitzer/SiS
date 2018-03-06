package com.kaufland.sis.controller.global;


import com.kaufland.sis.persistence.school.students.Student;
import com.kaufland.sis.persistence.school.subject.Subject;
import com.kaufland.sis.persistence.school.subject.SubjectService;
import com.kaufland.sis.persistence.school.subject.subjects.ComputerScience;
import com.kaufland.sis.persistence.school.subject.subjects.German;
import com.kaufland.sis.persistence.school.subject.subjects.Math;
import com.kaufland.sis.persistence.school.subject.subjects.Physics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ModelAttributes {

    @Autowired
    private SubjectService subjectService;

    private Student student = new Student();

    private Subject subject = new Subject();

    private List<Subject> subjectList = new ArrayList<>();

    private List<Subject> getAllSubjects() {
        German german = new German("The german language", "German", "Header", "Lernen");

        Math math = new Math("Mathematics", "Math", "Header", "Lernen");

        Physics physics = new Physics("Physics", "Physics", "Header", "");

        ComputerScience computerScience = new ComputerScience("Information Technology", "Computer Science", "<Header>", "Develop");

        subjectList.add(german);
        subjectList.add(math);
        subjectList.add(physics);
        subjectList.add(computerScience);
        return subjectList;
    }

    @ModelAttribute("student")
    public Student student() {
        return student;
    }

    @ModelAttribute("subject")
    public Subject subject() {
        return subject;
    }

    @ModelAttribute("subjectList")
    public List<Subject> subjects() {
        subjectList = getAllSubjects();
        return subjectList;
    }



}
