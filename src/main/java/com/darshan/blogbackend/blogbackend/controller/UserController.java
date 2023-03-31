package com.darshan.blogbackend.blogbackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.darshan.blogbackend.blogbackend.model.User;
import com.darshan.blogbackend.blogbackend.service.UserServiceImple;

@RestController
public class UserController {

    @Autowired
    private UserServiceImple userService; 
    
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<List<User>>(userService.getUsers(),HttpStatus.OK);
//        		;
    }

    @PostMapping("/users")
    public ResponseEntity<User> postUser(@RequestBody User user){
    System.out.println("Body "+user);
        return new ResponseEntity<User> (userService.postUser(user),HttpStatus.CREATED);
    }

    @DeleteMapping("/users")
    public ResponseEntity<User> postUser(@RequestParam int id){
    User user = new User();
    user.setId(id);
    userService.deleteUser(user);
    return new ResponseEntity<User>(user,HttpStatus.OK);
    }
}
