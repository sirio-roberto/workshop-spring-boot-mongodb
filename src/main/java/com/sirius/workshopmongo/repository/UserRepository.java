package com.sirius.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sirius.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
