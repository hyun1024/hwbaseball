package com.hw.springbaseball.user.service;

import com.hw.springbaseball.user.dto.SignupRequestDto;
import com.hw.springbaseball.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void signup(SignupRequestDto requestDto) {

    }
}
