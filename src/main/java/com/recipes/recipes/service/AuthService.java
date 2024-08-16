package com.recipes.recipes.service;

import com.recipes.recipes.dto.SigninReqDto;
import com.recipes.recipes.dto.SignupReqDto;
import com.recipes.recipes.entity.User;
import com.recipes.recipes.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserMapper userMapper;

    // BCryptPasswordEncoder -> password 를 암호화 하기.
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // 회원가입
    public int signup(SignupReqDto signupReqDto) {
        int successCount = 0;

        User user = signupReqDto.toEntity(passwordEncoder);
        successCount += userMapper.saveUser(user);
        System.out.println(successCount);
        return successCount;
    }

    // 로그인
    public String signin(SigninReqDto signinReqDto) {
        User user = userMapper.findUserByUsername(signinReqDto.getUsername());

        String result = "";

        if(user == null) {
            System.out.println("사용자 정보를 확인해주세요.");
            System.out.println(signinReqDto.getUsername());
            System.out.println(signinReqDto.getPassword());
            result = "사용자 정보를 확인해주세요.";
        }else if (!passwordEncoder.matches(signinReqDto.getPassword(), user.getPassword())) {
            System.out.println("사용자 정보를 확인해주세요.");
            System.out.println(signinReqDto.getUsername());
            System.out.println(signinReqDto.getPassword());
            result = "사용자 정보를 확인해주세요.";
        }else {
            System.out.println("로그인 성공");
            result = "로그인 성공";
        }
        return  result;
    }

}
