package org.mirza.springrestdocker.repository;

import org.mirza.springrestdocker.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
