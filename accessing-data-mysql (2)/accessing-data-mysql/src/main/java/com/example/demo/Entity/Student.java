package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(generator = "student-id-generator")
    @GenericGenerator(
            name = "student-id-generator",
            strategy = "com.example.demo.generator.StudentIdGenerator")
    @Column(name = "Student_ID")
    private String Student_ID;

    @Column(name = "SName")
    @JsonProperty("SName")
    private String SName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "Password")
    private String Password;

    @Column(name = "username")
    private String username;

    @Column(name = "dob")
    private LocalDate dob;

    public String getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(String student_ID) {
        Student_ID = student_ID;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}