package com.darshan.blogbackend.blogbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.blogbackend.blogbackend.model.Blogs;

public interface BlogsRepo extends JpaRepository<Blogs, Long> {
}
