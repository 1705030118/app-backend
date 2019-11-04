package com.ldm.core;

import com.ldm.api.UserService;
import com.ldm.dto.UserDTO;
import com.ldm.entity.User;
import com.ldm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDTO get(int userId) {
        UserDTO userDTO=userMapper.selectUser(userId);
        return userDTO;
    }
}
