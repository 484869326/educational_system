package com.yxc.homework.service;

import com.yxc.homework.entity.LoginForm;
import com.yxc.homework.entity.Student;

import java.util.List;

public interface StudentService {
    //学生登陆
    Student login(LoginForm loginForm);

    List<Student> selectList(Student student);

    Student fingBySno(Student student);

    int insert(Student student);

    int update(Student student);
    int deleteById(Integer[] ids);

    int updatePassword(Student student);
}
