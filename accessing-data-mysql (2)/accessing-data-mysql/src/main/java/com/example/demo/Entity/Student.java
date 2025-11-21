package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(generator = "student-id-generator")
    @GenericGenerator(
            name = "student-id-generator",
            strategy = "com.example.demo.generator.StudentIdGenerator")
    @Column(name = "Student_ID",nullable = false)
    private String Student_ID;

    @Column(name = "SName",nullable = false)
    @JsonProperty("SName")
    private String SName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "Password",nullable = false)
    private String Password;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "dob",nullable = false)
    private LocalDate dob;

    //@ManyToMany
   // @JoinTable(
   //         name = "student_has_course",
   //         joinColumns = @JoinColumn(name = "Student_Student_ID"),
       //     inverseJoinColumns = @JoinColumn(name = "Course_Course_ID")
  //  )
  //  private Set<Course> courses = new HashSet<>();
}