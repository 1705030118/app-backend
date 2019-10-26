package com.ldm.dto;

import lombok.Data;

@Data
public class UserDTO {
    private int userId;
    private String userNickname;
    private String signature;
    private String avatar;
}
