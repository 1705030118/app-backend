package com.ldm.aggregation;

import com.ldm.api.UserService;
import com.ldm.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/info")
    public UserDTO getCurrentInfo(){
        //安全对象拿到用户id
        return userService.get(123456);
    }
}
