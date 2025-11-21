package com.example.demo.Repository;


import com.example.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,String> {
   // @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.Course_ID = :courseId")
   //List<Student> findStudentsByCourseId(String courseId);
}