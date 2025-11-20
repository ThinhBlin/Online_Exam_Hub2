package com.example.demo.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRespository;
import com.example.demo.dto.request.StudentCreationResquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRespository studentRespository;
    public Student createStudent(StudentCreationResquest request){
        Student student =new Student();
        student.setSName(request.getSName());
        student.setUsername(request.getUsername());
        student.setPassword(request.getPassword());
        student.setPhone(request.getPhone());
        student.setDob(request.getDob());


        return studentRespository.save(student);
    }
    public List<Student> getStudents(){
        return studentRespository.findAll();
    }
}
