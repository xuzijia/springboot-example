package com.simple.springbootjpa.jpa.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @author simple
 * @description TODO
 * @date 2019/2/17 17:39
 */
@Data
public class UserPo {
    private String username;
    private String desc;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
