package com.example.demoredis.Entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RedisHash(value = "users")
public class Users implements Serializable {
    private static final long serialVersionUID = -214490344996507077L;
    @Id
    private Integer id;
    private String userName;
    private String password;

}
