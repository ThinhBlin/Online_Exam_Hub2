package com.example.demo.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.dto.request.StudentCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent(StudentCreationRequest request){
        Student student =new Student();
        student.setSName(request.getSName());
        student.setUsername(request.getUsername());
        student.setPassword(request.getPassword());
        student.setPhone(request.getPhone());
        student.setDob(request.getDob());


        return studentRepository.save(student);
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    //public List<Student> getStudentsByCourseId(String courseId) {
     //   return studentRepository.findStudentsByCourseId(courseId);
   // }
}
