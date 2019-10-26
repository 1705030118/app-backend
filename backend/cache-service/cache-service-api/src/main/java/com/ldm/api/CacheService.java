package com.ldm.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(value = "cache-service")
public interface CacheService {
    @GetMapping("/{key}")
    Object get(@PathVariable("key") String key);
//    <T> boolean set(String key, T value);
//    boolean exists(String key);
//    long incr(String key);
//    long decr(String key);
//    boolean delete(String key);


}
