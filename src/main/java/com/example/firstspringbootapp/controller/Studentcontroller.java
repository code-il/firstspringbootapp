package com.example.firstspringbootapp.controller;



import com.example.firstspringbootapp.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    @GetMapping("students/{id}/{firstname}/{lastname}")
    public Student studentpath(@PathVariable("id") int studentid,
                               @PathVariable("firstname") String firstname,
                               @PathVariable("lastname") String lastname){
        Student s1=new Student(studentid,firstname,lastname);
        return s1;
    }
}
