package com.rafu.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafu.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
