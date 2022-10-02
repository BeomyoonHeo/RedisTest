package com.example.demoredis.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoredis.Entity.Users;

public interface RedisRepository extends CrudRepository<Users, String> {

}
