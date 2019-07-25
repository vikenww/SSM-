package com.service;


import com.pojo.Teacher;

public interface LoginService {
    /**
     * 学生登陆验证，验证账号密码是否存在
     * @param
     * @param
     */
    public String checkStudentLogin(String idstudent, String pwdstudent);

    /**
     * 老师登陆验证，验证账号密码是否存在
     * @param id
     * @param pwd
     */
    public Teacher checkTeacherLogin(String id, String pwd);
}
