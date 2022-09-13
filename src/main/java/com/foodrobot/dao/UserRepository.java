package com.foodrobot.dao;

import com.foodrobot.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

    void deleteByEmail(String email);

}
