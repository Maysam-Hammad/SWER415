package com.example.payroll.security;


import lombok.Data;

@Data
public class RefreshTokenRequest {
    private String refreshToken;
}

