package com.example.bookkeeping.DTO;

import com.example.bookkeeping.DTO.interfaces.Dto;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto implements Dto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;
    private long phone;

}
