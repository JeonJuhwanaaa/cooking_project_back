package com.recipes.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int userId;
    private String username;
    private String password;
    private String name;
    private int genderId;
    private String email;
    private String phoneNumber;
    private String address;
    private String extraAddress;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

}
