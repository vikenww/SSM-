package com.controller;

import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TeacherHand/")
public class TeacherHand {
    @Autowired
    private TeacherService teacherService;

    /**
     * 老师查看本班所有学生在这科目的总成绩
     * teacherid用来标识这是哪个老师，语文数学还是英语,然后查询出一个list集合
     * 返回给页面显示
     * 将返回一个分数页面
     * @return
     *
     */
    @RequestMapping("teacherCheckScore")
    public String checkScore(String teacherid, Model model){

        model.addAttribute("teacherTable",teacherService.checkScore(teacherid));
        return "TeacherCheckScorePage";
    }

    /**
     *
     *
     * @param teacherid
     * @return
     * 将返回一个list对象，页面是也要将将要录入分数的这张表打印出来
     *
     */
  @RequestMapping("teacherRecordScore")
    public String recordingScore(String teacherid, Model model){
       model.addAttribute("teacherRecordingTable",teacherService.Recording(teacherid));
    return "recordingTablePage";
    }
}
