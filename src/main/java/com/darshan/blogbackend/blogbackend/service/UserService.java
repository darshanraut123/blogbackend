package com.darshan.blogbackend.blogbackend.service;

import java.util.List;

import com.darshan.blogbackend.blogbackend.model.User;

public interface UserService {
    public List<User> getUsers();
    public User postUser(User user);
    public void deleteUser(User user);
}
