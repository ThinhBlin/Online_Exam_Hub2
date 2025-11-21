package com.example.demo.Entity;
/*
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name = "Admin_ID",nullable = false)
    private String Admin_ID;

    @Column(name = "Password",nullable = false)
    private String Password;

    @Column(name = "OnlineWeb_W_ID", nullable = false)
    private String OnlineWeb_W_ID;

    // One-to-One: Admin manages one OnlineWeb
   /* @OneToOne
    @JoinColumn(name = "OnlineWeb_W_ID", referencedColumnName = "W_ID", insertable = false, updatable = false)
    private OnlineWeb onlineWeb;

}*/