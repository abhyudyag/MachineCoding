package com.example.bookmyshow.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found in DB")
public class NoUserFound extends RuntimeException{
}
