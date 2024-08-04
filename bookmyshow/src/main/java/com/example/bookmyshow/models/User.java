package com.example.bookmyshow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "bms_user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel{

    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;

}
