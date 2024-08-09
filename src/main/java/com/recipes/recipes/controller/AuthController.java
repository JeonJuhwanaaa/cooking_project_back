package com.recipes.recipes.controller;

import com.recipes.recipes.dto.SigninReqDto;
import com.recipes.recipes.dto.SignupReqDto;
import com.recipes.recipes.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // 회원가입 (등록)
    // @RequestBody - 주로 post, put 요청 때 사용
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupReqDto signupReqDto){
        return ResponseEntity.ok(authService.signup(signupReqDto));
    }

    // id / password 로그인 확인
    // @RequestParam - 주로 get 요청 때 사용 / 특정한 단일 값이나 여러 개의 단일 값을 받아야 할 때 사용. / 주로 VSCode 에서 axious 사용해서 요청 주소에 단일 값 넣어서 사용.
    // @ModelAttribute - 주로 get 요청 때 사용 / 폼 데이터나 여러 필드를 포함하는 데이터를 객체로 받고자 할 때 사용.
    @GetMapping("/signin")
    public ResponseEntity<?> signin(@ModelAttribute SigninReqDto signinReqDto) {
        return ResponseEntity.ok(authService.signin(signinReqDto));
    }


}
