package com.mourad.SpringApiStudents.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository  extends JpaRepository<Student,Integer> {


    Student findByEmail(String email);
    void deleteByEmail(String email);

}
