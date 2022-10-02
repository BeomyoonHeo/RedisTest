package com.example.demoredis.controller;

import java.util.Optional;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demoredis.Entity.Users;
import com.example.demoredis.repository.RedisRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestController implements ApplicationRunner {

    private final RedisRepository redisRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Users user = new Users();
        Integer dummyId = 5;
        // user.setId(2);
        // user.setUserName("hihi");
        // user.setPassword("byby");

        redisRepository.save(user);
        Optional<Users> foundUserInfo = redisRepository.findById(dummyId.toString());
        if (foundUserInfo.isPresent()) {
            System.out.println("found user info!");
            Users principle = (Users) foundUserInfo.get();
            System.out.println(principle.getId());
            System.out.println(principle.getUserName());
            System.out.println(principle.getPassword());
        } else {
            System.out.println("not Found User info");
        }

    }

}
