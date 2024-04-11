package com.lcwd.orm.services.impl;

import com.lcwd.orm.entities.User;
import com.lcwd.orm.repositories.UserRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        logger.info("user saved {} ",savedUser.getId());
        return savedUser;
    }

    @Override
    public User updateUser(User user, int userId) {
        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

   
    //get single user with given id
    @Override
    public User getUser(int userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.orElseThrow(()->new RuntimeException("user with given id notfound"));
        return user;
    }
}
