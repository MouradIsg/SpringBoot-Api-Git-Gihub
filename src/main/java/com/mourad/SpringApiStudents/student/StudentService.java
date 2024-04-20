package com.mourad.SpringApiStudents.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Mourad",
                        "Gharsalli",
                        LocalDate.now(),
                        "mourad.gh@gmail.com",
                        38

                ),
                new Student(
                        "aliiiii33333333",
                        "Gharsalli",
                        LocalDate.now(),
                        "ahmed.gh@gmail.com",
                        12

                )
        );
    }
}
