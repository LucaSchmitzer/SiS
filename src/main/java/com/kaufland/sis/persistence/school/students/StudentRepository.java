package com.kaufland.sis.persistence.school.students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findById(Long id);

    Student findByUsername(String userName);

    Student findByEmail(String email);

}
