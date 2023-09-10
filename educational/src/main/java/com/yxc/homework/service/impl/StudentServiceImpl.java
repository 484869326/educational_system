package com.yxc.homework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yxc.homework.entity.LoginForm;
import com.yxc.homework.entity.Student;
import com.yxc.homework.mapper.StudentMapper;
import com.yxc.homework.service.StudentService;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 学生登陆
     *
     * @param loginForm
     * @return
     */
    @Override
    public Student login(LoginForm loginForm) {
        return studentMapper.login(loginForm);
    }

    @Override
    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);

    }

    @Override
    public Student fingBySno(Student student) {
        return studentMapper.findBySno(student);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return studentMapper.deleteById(ids);
    }

    @Override
    public int updatePassword(Student student) {
        return studentMapper.updatePassword(student);
    }

}
