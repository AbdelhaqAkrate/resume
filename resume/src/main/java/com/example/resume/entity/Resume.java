package com.example.resume.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "resumeFile")
    private String resumefile;
    @ManyToOne
    @JoinColumn(name = "user_id" )
    private User user;
    @OneToMany(mappedBy = "resume")
    private List<Comment> comments;

}
