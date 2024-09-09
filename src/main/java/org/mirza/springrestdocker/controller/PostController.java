package org.mirza.springrestdocker.controller;

import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping
    @Description("get all post")
    public ResponseEntity<String> getPost() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping
    @Description("get post by id")
    public ResponseEntity<String> getPostById(@RequestParam Long id) {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping
    @Description("create new post")
    public ResponseEntity<String> createPost() {
        return ResponseEntity.ok("Hello World");
    }

    @PutMapping
    @Description("update post by id")
    public ResponseEntity<String> updatePost(@RequestParam Long id, @RequestParam String body) {
        return ResponseEntity.ok("Hello World");
    }

    @PutMapping
    @Description("delete post by id")
    public ResponseEntity<String> deletePost(@RequestParam Long id) {
        return ResponseEntity.ok("Hello World");
    }
}
