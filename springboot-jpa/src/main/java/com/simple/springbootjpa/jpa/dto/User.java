package com.simple.springbootjpa.jpa.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author simple
 * @description TODO
 * @date 2019/2/17 17:26
 */
@Entity
@Table(name="tb_user")
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false,name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "desc")
    private String desc;
}
