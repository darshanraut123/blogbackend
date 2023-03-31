package com.darshan.blogbackend.blogbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darshan.blogbackend.blogbackend.model.Blogs;
import com.darshan.blogbackend.blogbackend.repository.BlogsRepo;

@Service
public class BlogsServiceImple implements BlogsService {
    @Autowired
    private BlogsRepo blogsRepo;

    @Override
    public List<Blogs> getBlogs() {
        return blogsRepo.findAll();
    }

    @Override
    public Blogs postBlogs(Blogs blogs) {
        return blogsRepo.save(blogs);
    }
}
