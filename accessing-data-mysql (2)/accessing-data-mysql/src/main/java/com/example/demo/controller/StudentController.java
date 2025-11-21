package com.example.demo.controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import com.example.demo.dto.request.StudentCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    Student createStudent(@RequestBody StudentCreationRequest resquest){
        return studentService.createStudent(resquest);
    }
    @GetMapping
    List<Student> getStudents(){
        return studentService.getStudents();
    }
   /* @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Student>> getStudentsByCourse(@PathVariable String courseId) {
        return ResponseEntity.ok(studentService.getStudentsByCourseId(courseId));
    }*/
}
