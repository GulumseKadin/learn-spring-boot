package com.serifhaniskl.repository;

import com.serifhaniskl.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsersRepository extends MongoRepository<Users,String> {


}
