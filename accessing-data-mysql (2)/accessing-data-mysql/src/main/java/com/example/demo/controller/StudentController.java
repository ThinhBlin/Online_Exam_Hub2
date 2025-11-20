package com.example.demo.controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import com.example.demo.dto.request.StudentCreationResquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping()
    Student createStudent(@RequestBody StudentCreationResquest resquest){
        return studentService.createStudent(resquest);
    }
    @GetMapping
    List<Student> getStudents(){
        return studentService.getStudents();
    }

}
