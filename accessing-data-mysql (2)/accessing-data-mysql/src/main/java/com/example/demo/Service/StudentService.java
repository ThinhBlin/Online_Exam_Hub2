package com.example.demo.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRespository;
import com.example.demo.dto.request.StudentCreationResquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRespository studentRespository;
    public Student createStudent(StudentCreationResquest request){
        Student student =new Student();
        student.setUsername(request.getUsername());
        student.setPassword(request.getPassword());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setDob(request.getDob());

        return studentRespository.save(student);
    }
}
