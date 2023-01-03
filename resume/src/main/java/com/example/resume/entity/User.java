package com.example.resume.entity;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Resume> resumes;
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
    public User(String full_name, String avatar, String email, String password)
    {
        this.full_name = full_name;
        this.avatar = avatar;
        this.email = email;
        this.password = password;
    }
}
