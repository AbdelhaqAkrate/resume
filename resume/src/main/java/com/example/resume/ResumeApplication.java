package com.example.resume;
import java.util.List;
import java.util.stream.Collectors;

import com.example.resume.dto.UserDto;
import com.example.resume.entity.User;
import org.modelmapper.ModelMapper;
import com.example.resume.repository.UserRepository;
import com.example.resume.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResumeApplication implements CommandLineRunner {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}

//@Autowired
//	UserRepository repository;
	public void run(String ...args) throws Exception
	{
//		repository.save(new User("ken","ok-2932x2932.jpg","azer@gmail.com","1234"));
//		Iterable<User> users = repository.findAll();
//		users.forEach(user -> System.out.println(user));
	}
}
