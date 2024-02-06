package com.example.shop.dto;

public class AuthResponseDTO {
    private String accessToken;
    private String tokenType;

    public AuthResponseDTO(String accessToken, String tokenType) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }
}
