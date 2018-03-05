package com.kaufland.sis.persistence.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

     Student findById(Long id);

     Student findByUsername(String userName);

     Student findByEmail(String email);

}
