package com.rajat13.redisclusterspringboot;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("User")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class User {
    @NonNull private String id;
    @NonNull private String username;
}
