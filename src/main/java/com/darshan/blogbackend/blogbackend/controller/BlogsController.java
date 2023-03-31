package com.darshan.blogbackend.blogbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.blogbackend.blogbackend.model.Blogs;
import com.darshan.blogbackend.blogbackend.service.BlogsServiceImple;

@RestController
public class BlogsController {

    @Autowired
    private BlogsServiceImple blogsServiceImple;

    @GetMapping("/blogs")
    public ResponseEntity<List<Blogs>> getBlogs() {
        return ResponseEntity.ok().body(blogsServiceImple.getBlogs());
    }

    @PostMapping("/blogs")
    public ResponseEntity<Blogs> postBlogs(@RequestBody Blogs blogs) {
        return new ResponseEntity<Blogs>(blogsServiceImple.postBlogs(blogs), HttpStatus.CREATED);
    }
}
