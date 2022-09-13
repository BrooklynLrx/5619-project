package com.foodrobot.controller;

import com.foodrobot.dao.UserRepository;
import com.foodrobot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/add")
    public  User addUser(String email,String username,String password){
        User user = new User();
        user.setEmail(email);
        user.setUser_name(username);
        user.setPassword(password);
        User save = userRepository.save(user);
        return save;
    }


}
