package com.example.HelloWorld.controller;

import com.example.HelloWorld.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Amlan", "Supakar"));
        students.add(new Student(2,"B2", "Supakar"));
        students.add(new Student(3,"Ramesh", "Supakar"));
        students.add(new Student(4,"Suniti", "Dash"));


        return students;

    }

    //Path Variable

    @GetMapping("cststudent/{id}/{fn}/{ln}")
    public Student getCstStudent(@PathVariable("id") int id,
                                 @PathVariable("fn") String fn,
                                 @PathVariable("ln") String ln){
        Student cstStudent = new Student(id, fn, ln);
        return cstStudent;

    }

    //Query Parameter / Request Parameter : RequestParam =>
    // query?id=4545&fname=ayuu&lname=jjjai

    @GetMapping("qstudent")
    public Student queryStudent(@RequestParam int id,
                                @RequestParam String fname,
                                @RequestParam String lname){
        Student qstudent = new Student(id, fname, lname);
        return qstudent;
    }


}
