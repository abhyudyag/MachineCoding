package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.RegisterUserRequestDto;
import com.example.bookmyshow.dtos.RegisterUserResponseDto;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User getuser(@PathVariable("userId") Long id){
        return userService.getUserById(id);
    }

    @PostMapping(path = "/register")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody RegisterUserResponseDto registerUser(@RequestBody RegisterUserRequestDto requestDto){
        System.out.println(requestDto);
        User user = userService.registerUser(requestDto.getName(),requestDto.getEmail(),requestDto.getPassword());
        return new RegisterUserResponseDto(user.getId());
    }

}
