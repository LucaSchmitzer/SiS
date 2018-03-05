package com.kaufland.sis.doamin;

import com.kaufland.sis.persistence.school.Student;
import com.kaufland.sis.persistence.school.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    private void saveStudent(Student saveStudent) {
        studentRepository.save(saveStudent);
    }

    public void checkAvailability(Student student) {
        Student checkStudent = new Student();
        if (!checkStudent.getUsername().isEmpty() || checkStudent.getUsername() != null) {
            student.setUsername(checkStudent.getUsername());
        }
        if (checkStudent.getId() != null) {
            student.setId(checkStudent.getId());
        }
        Student foundByUsername = studentRepository.findByUsername(student.getUsername());
        Student foundByEmail = studentRepository.findByEmail(student.getEmail());
        Student foundById = studentRepository.findById(student.getId());
        if (foundByEmail == null || foundByUsername == null || foundById == null) {
            saveStudent(student);
        }
    }
}



