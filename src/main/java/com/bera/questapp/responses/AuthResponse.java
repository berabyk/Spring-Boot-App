package com.bera.questapp.responses;

import lombok.Data;

@Data
public class AuthResponse {
    String message;
    Long userId;
}