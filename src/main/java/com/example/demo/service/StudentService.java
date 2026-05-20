package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {

        return List.of(
                new Student(1L, "Farhad"),
                new Student(2L, "Galaxy")
        ); 
    }
}
