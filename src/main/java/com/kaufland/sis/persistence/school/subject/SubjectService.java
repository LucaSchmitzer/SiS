package com.kaufland.sis.persistence.school.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    private Subject subject = new Subject();

    public Subject subjectFoundByName(String name) {
        subject = subjectRepository.findByName(name);
        return subject;
    }

}
