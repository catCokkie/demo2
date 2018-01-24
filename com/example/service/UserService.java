package com.example.service;

import com.example.role.User;

public interface UserService {
    public User saveTeacherWithRollBack (User user);
    public User deleteUserWithRollBack(User user);


}

