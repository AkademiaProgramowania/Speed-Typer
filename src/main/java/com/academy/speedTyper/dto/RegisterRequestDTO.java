package com.academy.speedTyper.dto;

public class RegisterRequestDTO {

    private String email;
    private String password;
    private String repassword;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassword() {
        return repassword;
    }

    @Override
    public String toString() {
        return "RegisterRequestDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", repassword='" + repassword + '\'' +
                '}';
    }
}
