package com.example.demo.controller;

import com.example.demo.entity.*;

public class studentController{

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll(){

    }

}