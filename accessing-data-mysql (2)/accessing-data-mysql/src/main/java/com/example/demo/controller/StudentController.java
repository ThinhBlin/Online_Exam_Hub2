package com.example.demo.controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import com.example.demo.dto.request.StudentCreationResquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/users")
    Student createStudent(@RequestBody StudentCreationResquest resquest){
        return studentService.createStudent(resquest);
    }

}
