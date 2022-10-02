package com.example.demoredis.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoredis.Entity.Meeting;

public interface MeetingRepository extends CrudRepository<Meeting, String> {

}
