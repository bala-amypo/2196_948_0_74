package com.example.demo.controller;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;
import com.example.demo.service.*;


@RestController
public class studentController{

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public ListstudentEntity>getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@valid @ResquestBody studentEntity student){
        return service.addStudent(student);
    }
    
}
