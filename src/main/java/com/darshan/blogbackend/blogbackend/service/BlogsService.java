package com.darshan.blogbackend.blogbackend.service;

import java.util.List;
import com.darshan.blogbackend.blogbackend.model.Blogs;

public interface BlogsService {
    public List<Blogs> getBlogs();

    public Blogs postBlogs(Blogs blogs);
}
