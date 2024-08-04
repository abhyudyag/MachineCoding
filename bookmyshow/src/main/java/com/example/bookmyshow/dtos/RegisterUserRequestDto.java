package com.example.bookmyshow.dtos;

import lombok.Data;

@Data
public class RegisterUserRequestDto {

    private String name;
    private String password;
    private String email;

}
