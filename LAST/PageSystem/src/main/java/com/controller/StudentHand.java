package com.controller;

import com.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是学生页面将要进行的操作类
 * 所有学生在页面发送的请求都将被这个类里面的方法相应
 * 不管老师是否录了学生的成绩，都将查询的结果返回给前台页面
 * 让前台在页面上判断，如果没成绩就不打印表格，如果有成绩就打印
 */
@Controller
@RequestMapping("/StudentHand/")
public class StudentHand {
    private StudentService studentService;

    @RequestMapping("checkScore")
    public String checkScore(Model model){
        //checkScore之后将返回一个封装了分数的实体类，将这个实体类保存起来
        //以便在页面显示

        model.addAttribute("scoreTable",studentService.checkScore());
        return "ShowScorePage";
    }
}
