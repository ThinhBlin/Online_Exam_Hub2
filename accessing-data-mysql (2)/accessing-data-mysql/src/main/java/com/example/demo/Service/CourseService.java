package com.example.demo.Service;

import com.example.demo.Entity.Course;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.dto.request.CourseCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public Course createCourse(CourseCreationRequest request){
        Course course=new Course();

        course.setCourse_ID(request.getCourse_ID());
        course.setCName(request.getCName());
        course.setOnlineWeb_W_ID(request.getOnlineWeb_W_ID());


        return courseRepository.save(course);
    }
    public List<Course> getCourses(){
        return  courseRepository.findAll();
    }
}
