package com.example.resume.controller;

import com.example.resume.dto.UserDto;
import com.example.resume.entity.User;
import com.example.resume.repository.UserRepository;
import com.example.resume.restUriConstants.UserRestUriConstants;
import com.example.resume.services.UserServices;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController  {

    @Autowired
     ModelMapper modelMapper;
    UserServices userServices;
    public UserController(UserServices userServices) {
        super();
        this.userServices = userServices;
    }
  
    
    //  @Autowired
    //  UserRepository repository;
    //  @GetMapping(value = UserRestUriConstants.GET_ALL_USERS, produces = MediaType.APPLICATION_JSON_VALUE)
    //  public @ResponseBody List<User> getAllUsers()
    //  {
    //      return (List<User>) repository.findAll();
    //  }
   @GetMapping(value = UserRestUriConstants.GET_ALL_USERS)
   public @ResponseBody List<User> getAllUsers()
   {
       return userServices.getAllUsers();
   }
    @PostMapping(value = UserRestUriConstants.CREATE_USER)
    public @ResponseBody User createUser(@RequestBody UserDto userDto)
    {
        User user = new User();
        user.setFull_name(userDto.getName());
        user.setAvatar(userDto.getAvatar());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        User saveUser = userServices.saveUser(user);
        return new ResponseEntity<User>(saveUser, HttpStatus.CREATED).getBody();
    }
    @GetMapping(value = UserRestUriConstants.GET_USER)
    public @ResponseBody UserDto getUserById(@PathVariable("id") Integer id)
    {
        User user = userServices.findById(id);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return new ResponseEntity<UserDto>(userDto, HttpStatus.OK).getBody();
    }



}
