package com.darshan.blogbackend.blogbackend.service;
import com.darshan.blogbackend.blogbackend.model.User;
import com.darshan.blogbackend.blogbackend.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @Override
    public User postUser(User user){
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(User user){
        userRepo.delete(user);
    }

}
