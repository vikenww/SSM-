package com.controller;

import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆验证，用户勾选身份之后，通过这个函数识别是老师还是学生，如果是学生
 * 就调用学生的登陆验证函数，如果是老师，就验证老师的登陆验证函数
 * 老师登陆之后，相当于查询表，查到老师的数据之后，将id返还给前台前台拿到数据之后，继续点击查看成绩
 *  再次将这个数据传回给后台，然后后台在service层将这个数据传给dao层
 */
@Controller
@RequestMapping("/check")
public class Check {
    @Autowired
    private LoginService loginInService;
//    private Teacher teacherLoginService;
//    private String successlogin;

//    public String checkIdentity(String id, String pwd, String identity, Model model){
//        teacher=loginInService.checkTeacherLogin(id,pwd);
//        successlogin=loginInService.checkStudentLogin(id,pwd);
//        if(identity.equals("教师")){
//
//            if (teacher!=null)
//            {
//                model.addAttribute("teacherinfo",teacher);
//                return"TeacherPage";
//            }else{
//                return "failtologinpage";
//            }
//        }else if (identity.equals("学生")){
//           if (successlogin.equals("success")){
//               return "StudentPage";
//           }else{
//               return"failtologinpage";
//           }
//        }else {
//            return "failtologinpage";
//        }
//
//    }
@RequestMapping("/checkStudentLogin")
//    public String checkIdentity(){
//    System.out.println("333####################################################################");
//    System.out.println("#############################################################");
//    System.out.println("######################################################");
//    return "success";
//}
public String check(String idstudent, String pwdstudent) {
    System.out.println(idstudent+pwdstudent+"333####################################################################");
    System.out.println("#############################################################");
    System.out.println("######################################################");
        if (loginInService.checkStudentLogin(idstudent, pwdstudent) =="success") {
            return "success";
        } else {
            return "false";
        }

    }
}