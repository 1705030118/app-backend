package com.ldm.api;

import com.ldm.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service")
public interface UserService {
    @GetMapping("/{id}")
    UserDTO get(@PathVariable("id") int id);

}
