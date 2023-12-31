package com.yxc.homework.service.impl;

import com.yxc.homework.entity.LoginForm;
import com.yxc.homework.entity.Teacher;
import com.yxc.homework.mapper.TeacherMapper;
import com.yxc.homework.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 验证登陆信息
     *
     * @param loginForm
     * @return
     */
    @Override
    public Teacher login(LoginForm loginForm) {
        return teacherMapper.login(loginForm);
    }

    /**
     * 教师身份修改密码
     *
     * @param teacher
     * @return
     */
    @Override
    public int updatePassword(Teacher teacher) {
        return teacherMapper.updatePassword(teacher);
    }

    @Override
    public List<Teacher> selectList(Teacher teacher) {
        return teacherMapper.selectList(teacher);
    }

    @Override
    public Teacher findByTno(Teacher teacher) {
        return teacherMapper.findByTno(teacher);
    }

    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return teacherMapper.deleteById(ids);
    }
}