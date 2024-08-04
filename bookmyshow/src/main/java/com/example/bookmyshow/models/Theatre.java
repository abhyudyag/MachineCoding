package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{

    private String name;
    @ManyToOne
    private Region region;
    private String address;

}
