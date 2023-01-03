package com.example.resume.dto;

import lombok.Data;

@Data
public class CommentDto {
    private Integer id;
    private String comment;
    private Integer resumeId;
    private Integer userId;
}
