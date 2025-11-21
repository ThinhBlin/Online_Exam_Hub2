package com.example.demo.controller;

import com.example.demo.Entity.Course;
import com.example.demo.Service.CourseService;
import com.example.demo.dto.request.CourseCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping()
    Course createCourse(@RequestBody CourseCreationRequest request){
        return courseService.createCourse(request);
    }
    @GetMapping()
    List<Course> getCourse(){
        return courseService.getCourses();
    }


}
