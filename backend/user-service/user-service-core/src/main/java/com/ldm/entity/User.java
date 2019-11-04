package com.ldm.entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userNickname;
    private String signature;
    private String avatar;
}
