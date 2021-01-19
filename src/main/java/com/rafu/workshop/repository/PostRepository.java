package com.rafu.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafu.workshop.domain.Post;
import com.rafu.workshop.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
