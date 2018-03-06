package com.kaufland.sis.persistence.school.subject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long>{

    Subject findByName(String name);


}
