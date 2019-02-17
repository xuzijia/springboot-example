package com.simple.springbootjpa.jpa.dao;

import com.simple.springbootjpa.jpa.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author simple
 * @description TODO
 * @date 2019/2/17 17:29
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findUserByUsername(String username);
}
