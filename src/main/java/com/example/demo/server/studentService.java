package com.example.demo.service;

import com.example.demo.entity.*;
interface studentService{

    List<studentEntity>getAll();

    studentEntity addStudent(studentEntity student)
}