package com.hw.springbaseball.user.controller;

import com.hw.springbaseball.user.dto.SignupRequestDto;
import com.hw.springbaseball.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequestDto requestDto){
        userService.signup(requestDto);
        return "";
    }
}
