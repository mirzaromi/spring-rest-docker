package org.mirza.springrestdocker.controller;

import lombok.RequiredArgsConstructor;
import org.mirza.springrestdocker.dto.BaseResponse;
import org.mirza.springrestdocker.dto.PostDto;
import org.mirza.springrestdocker.service.PostService;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    @Description("get all post")
    public ResponseEntity<BaseResponse<List<PostDto>>> getPost() {
        List<PostDto> postlist = postService.getAllPosts();
        BaseResponse<List<PostDto>> baseResponse = new BaseResponse<>(HttpStatus.OK.getReasonPhrase(), "success get data", postlist);
        return ResponseEntity.ok(baseResponse);
    }

    @GetMapping("/{id}")
    @Description("get post by id")
    public ResponseEntity<BaseResponse<PostDto>> getPostById(@PathVariable Long id) {
        PostDto post = postService.getPostById(id);
        BaseResponse<PostDto> response = new BaseResponse<>(HttpStatus.OK.getReasonPhrase(), "success get data", post);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Description("create new post")
    public ResponseEntity<BaseResponse<PostDto>> createPost(@RequestBody PostDto postDto) {
        PostDto post = postService.createPost(postDto);
        BaseResponse<PostDto> response = new BaseResponse<>(HttpStatus.CREATED.getReasonPhrase(), "success create post", post);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    @Description("update post by id")
    public ResponseEntity<BaseResponse<PostDto>> updatePost(@PathVariable Long id, @RequestBody PostDto postDto) {
        postService.updatePost(id, postDto);
        BaseResponse<PostDto> response = new BaseResponse<>(HttpStatus.OK.getReasonPhrase(), "success update post", postDto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    @Description("delete post by id")
    public ResponseEntity<BaseResponse<PostDto>> deletePost(@PathVariable Long id) {
        PostDto postDto = postService.deletePost(id);
        BaseResponse<PostDto> response = new BaseResponse<>(HttpStatus.OK.getReasonPhrase(), "success delete post", postDto);
        return ResponseEntity.ok(response);
    }
}
