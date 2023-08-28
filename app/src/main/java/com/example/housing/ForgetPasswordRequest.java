package com.example.housing;

public class ForgetPasswordRequest {
    private String email;
    private String new_password;

    public ForgetPasswordRequest(String email, String new_password) {
        this.email = email;
        this.new_password = new_password;
    }
}
