package com.darshan.blogbackend.blogbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.blogbackend.blogbackend.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
