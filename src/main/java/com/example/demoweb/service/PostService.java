package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    public Post[] listAllPosts(){
        return new Post[] {new Post("Привет"), new Post("мир"), new Post("!"),
        };
    }
}
