package org.mirza.springrestdocker.repository;

import org.mirza.springrestdocker.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    Optional<Post> findPostByIdAndIsDeletedFalse(Long id);

    List<Post> findAllByIsDeletedFalse();
}
