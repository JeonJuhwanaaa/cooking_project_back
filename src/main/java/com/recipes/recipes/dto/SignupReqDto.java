package com.recipes.recipes.dto;

import com.recipes.recipes.entity.User;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Data
@Builder
public class SignupReqDto {
    private String username;
    private String password;
    private String name;
    private int genderId;
    private String email;
    private String phoneNumber;
    private String address;
    private String extraAddress;


    public User toEntity(BCryptPasswordEncoder passwordEncoder){
        return User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .name(name)
                .genderId(genderId)
                .email(email)
                .phoneNumber(phoneNumber)
                .address(address)
                .extraAddress(extraAddress)
                .build();
    }

}
