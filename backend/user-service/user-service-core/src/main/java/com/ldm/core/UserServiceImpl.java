package com.ldm.core;

import com.ldm.api.UserService;
import com.ldm.dto.UserDTO;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO get(int userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userId);
        userDTO.setAvatar("https://lidongming.oss-cn-shenzhen.aliyuncs.com/images/v2-34a3387ce1a1e5a4aa9bc48fca19a677.jpg");
        userDTO.setSignature("战无不胜攻无不克");
        userDTO.setUserNickname("自明小友");
        return userDTO;
    }
}
