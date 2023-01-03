package com.example.resume.repository;

import com.example.resume.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = :email")
    public List<User> findByEmail(@Param("email") String email);
    public List<User> findAll();
    
}
