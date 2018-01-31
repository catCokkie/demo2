package com.example.service;

import com.example.role.User;

/**
 *
 */
public interface UserService {
    /**
     * 存储教师
     * @param user 教师
     * @return
     */
    public User saveTeacherWithRollBack (User user);

    /**
     * 删除教师
     * @param user 教师
     * @return
     */
    public User deleteTeacherWithRollBack (User user);

    /**
     * 存储学生
     * @param user 学生
     * @return
     */
    public User saveStudentWithRollBack (User user);

    /**
     * 删除学生
     * @param user 学生
     * @return
     */
    public User deleteStudentWithRollBack (User user);
}

