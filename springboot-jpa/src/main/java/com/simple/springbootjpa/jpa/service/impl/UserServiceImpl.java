package com.simple.springbootjpa.jpa.service.impl;

import com.simple.springbootjpa.jpa.dao.UserRepository;
import com.simple.springbootjpa.jpa.dto.User;
import com.simple.springbootjpa.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author simple
 * @description TODO
 * @date 2019/2/17 17:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
