package com.simple.springbootjpa.jpa.controller;

import com.simple.springbootjpa.jpa.dao.UserRepository;
import com.simple.springbootjpa.jpa.dto.User;
import com.simple.springbootjpa.jpa.po.UserPo;
import com.simple.springbootjpa.jpa.service.UserService;
import com.simple.springbootjpa.jpa.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author simple
 * @description TODO
 * @date 2019/2/17 17:35
 */
@RestController
@RequestMapping("/jpa")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("checkUsername/{username}")
    public List<User> checkUsername(@PathVariable(name = "username") String username){
        List<User> userByUsername = userService.findUserByUsername(username);
        return userByUsername;
    }
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public UserVo addUser(UserPo userPo){
        User user = new User();
        BeanUtils.copyProperties(userPo,user);
        user.setDesc("11");
        user.setBirthday(new Date());
        user.setPassword("223");
        User save = userRepository.save(user);
        UserVo userVo=new UserVo();
        BeanUtils.copyProperties(save,userVo);
        return userVo;
    }
}
