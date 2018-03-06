package com.kaufland.sis.persistence.school.subject.subjects;

import com.kaufland.sis.persistence.school.subject.Subject;
import com.kaufland.sis.persistence.school.subject.subjects.exercise.Exercise;


public class ComputerScience extends Subject {

    private Exercise excersice;



    public ComputerScience(String url, String info, String name, String header, String content) {
        super(url, info, name, header, content);
    }

    public ComputerScience() {

    }

}
