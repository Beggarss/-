package com.service;

import com.model.User;

import java.util.List;

public interface UserService {
    public int insertUser(User user);
    public User getUser(int id);
    public List<User> getAll();
}
