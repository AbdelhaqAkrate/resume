package com.example.resume.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String name;
    private String avatar;
    private String email;
    private String password;

    public UserDto() {
    }
    public UserDto( String name, String avatar, String email, String password) {
        this.name = name;
        this.avatar = avatar;
        this.email = email;
        this.password = password;
    }


}
