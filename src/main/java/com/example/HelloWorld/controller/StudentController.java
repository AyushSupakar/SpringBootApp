package com.example.HelloWorld.controller;

import com.example.HelloWorld.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student1 = new Student(
                1,
                "Ayush",
                "Supakar"
        );
        return student1;
    }
}
