package com.baturin.quickbuy.controller;

import com.baturin.quickbuy.dto.ResponseDto;
import com.baturin.quickbuy.dto.user.SignInDto;
import com.baturin.quickbuy.dto.user.SignInReponseDto;
import com.baturin.quickbuy.dto.user.SignupDto;
import com.baturin.quickbuy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    // two apis

    // signup

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signin

    @PostMapping("/signin")
    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }


}
