package com.simple.springbootjpa.jpa.service;

import com.simple.springbootjpa.jpa.dto.User;

import java.util.List;

/**
 * @author simple
 * @description TODO
 * @date 2019/2/17 17:30
 */
public interface UserService {
    List<User> findUserByUsername(String username);
}
