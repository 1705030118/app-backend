package com.ldm.core;

import com.ldm.api.UserService;
import com.ldm.dto.UserDTO;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO get(@PathVariable("id") int id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setAge(24);
        userDTO.setName("张三");
        userDTO.setPassword("admin");
        userDTO.setUsername("admin");
        return userDTO;
    }
}
