package com.michalskiba.one2tribe.services;

import com.michalskiba.one2tribe.Model.User;
import com.michalskiba.one2tribe.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveBeer(String name) {
        User beer = new User(name);
        return userRepository.save(beer);
    }
}
