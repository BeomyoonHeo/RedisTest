package com.example.demoredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demoredis.Entity.Meeting;
import com.example.demoredis.repository.MeetingRepository;
import com.example.demoredis.repository.RedisRepository;

@Component
public class DefaultDataPopulator {// implements ApplicationRunner {

    // @Autowired
    // MeetingRepository meetingRepository;
    // @Autowired
    // RedisRepository redisRepository;

    // @Override
    // public void run(ApplicationArguments args) throws Exception {
    // Meeting meeting = new Meeting();
    // meeting.setTitle("new Title");
    // meetingRepository.save(meeting);

    // meetingRepository.findAll().forEach(m -> {
    // System.out.println("================");
    // System.out.println(m.getTitle() + " ");
    // });

    // }
}
