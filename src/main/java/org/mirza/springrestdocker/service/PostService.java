package org.mirza.springrestdocker.service;

import enums.ResponseCode;
import exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mirza.springrestdocker.dto.PostDto;
import org.mirza.springrestdocker.entity.Post;
import org.mirza.springrestdocker.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        List<PostDto> postDtoList = new ArrayList<>();
        for (Post post : posts) {
            PostDto postDto = new PostDto();
            postDto = modelMapper.map(post, PostDto.class);
            postDtoList.add(postDto);
        }
        return postDtoList;
    }

    public PostDto getPostById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new NotFoundException(ResponseCode.POST_NOT_FOUND));
        return modelMapper.map(post, PostDto.class);
    }

    public PostDto createPost(PostDto postDto) {
        Post post = modelMapper.map(postDto, Post.class);
        post = postRepository.save(post);
        return modelMapper.map(post, PostDto.class);
    }
}
