package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "Course_ID",nullable = false)
    private String Course_ID;

    @Column(name = "CName",nullable = false)
    private String CName;

    @Column(name = "OnlineWeb_W_ID",nullable = false)
    @JsonProperty("online_web_w_id")
    private String OnlineWeb_W_ID;

    // Many-to-One: Many Courses belong to one OnlineWeb
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OnlineWeb_W_ID", referencedColumnName = "W_ID", insertable = false, updatable = false)
    private OnlineWeb onlineWeb;*/

    // Many-to-Many: Course can have many Students
    //@ManyToMany(mappedBy = "courses")
  //  private Set<Student> students = new HashSet<>();
}