package com.oneDev.onlinelibrary.service;

import com.oneDev.onlinelibrary.dto.JWTAuthResponse;
import com.oneDev.onlinelibrary.dto.LoginDto;
import com.oneDev.onlinelibrary.dto.RegisterDto;

public interface AuthService {

    JWTAuthResponse login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
