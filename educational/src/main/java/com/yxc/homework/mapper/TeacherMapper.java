package com.yxc.homework.mapper;

import com.yxc.homework.entity.LoginForm;
import com.yxc.homework.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    /**
     * 验证登录信息
     * @param loginForm
     * @return
     */
    Teacher login(LoginForm loginForm);

    /**
     * 教师身份修改密码
     * @param teacher
     * @return
     */
    int updatePassword(Teacher teacher);
    List<Teacher> selectList(Teacher teacher);
    Teacher findByTno(Teacher teacher);
    int insert(Teacher teacher);
    int update(Teacher teacher);
    // TODO: 根据id删除指定教师信息
     int deleteById(Integer[] ids);
}
