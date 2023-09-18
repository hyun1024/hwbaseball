package com.hw.springbaseball.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignupRequestDto {
    private final String username;
    private final String password;
    private final String nickname;

    @Builder
    public SignupRequestDto(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
