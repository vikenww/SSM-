package com.service.impl;

import com.dao.StudentCheckLoginDao;
import com.pojo.Student;
import com.pojo.Teacher;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 登陆界面服务的实现类
 *
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StudentCheckLoginDao studentCheckLoginDao;

    private Student student;
    /**
     *
     * 登陆查询函数，根据id，和pwd，行访问数据库查询
     * 查询成功返回success，失败返回fail
     * @param
     * @param
     * @return
     */
    @Override
    public String checkStudentLogin(String idstudent, String pwdstudent) {
        System.out.println("=================================================");
        System.out.println("================================================");
        System.out.println("================================================");

        System.out.println("================================================");
        student=studentCheckLoginDao.StudentCheckLogin(idstudent,pwdstudent);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
       if (student!=null){
           return "success";
       }else {
           return "fail";
       }

    }

    @Override
    public Teacher checkTeacherLogin(String id, String pwd) {
        return null;
    }
}
