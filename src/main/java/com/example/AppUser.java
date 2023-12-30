package com.example;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    @Transient
    private int age;
    private LocalDate date;


    public int getAge(){
        return Period.between(date, LocalDate.now()).getYears();
    }
}