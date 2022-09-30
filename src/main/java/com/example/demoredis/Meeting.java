package com.example.demoredis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@RedisHash("Meetings")
public class Meeting {
    @Id
    private String id;
    private String title;
}
