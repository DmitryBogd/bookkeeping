package com.example.bookkeeping.dao.interfaces;

import com.example.bookkeeping.DTO.UserDto;
import com.example.bookkeeping.DTO.interfaces.Dto;

import java.util.List;

public interface Dao {
    List<Dto> getAll();
    Dto get(long id);
    void create(Dto newObject);
    void update(long id);
}
