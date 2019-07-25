package com.controller;

import com.pojo.ScoreTable;
import com.service.TeacherRecordScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 前台发送一个ajax请求给我，我对它进行数据库存储信息，存储成功之后怎样把提示信息返回给前台
 * @ResponseBody List<ScoreTable>jason异步的时候响应一个list表格
 * 老师提交一个表格，需要前台封装好jason对象放在list里面，
 * 后台拿到数据之后进行解析，并且返回是否将数据存入数据库的信息
 *
 */
@Controller
@RequestMapping("/teacherRecordingScore/")
public class TeacherRecordingScore {
    private TeacherRecordScoreService teacherRecordScoreService;
    private String isSuccess;
    @RequestMapping("recordScore")

    public @ResponseBody
    String recordScore(@RequestBody List<ScoreTable> list){
        isSuccess=teacherRecordScoreService.RecordingScore(list);
        if (isSuccess.equals("success")){
            return "录分成功!";
        }else{
            return "录分失败！";
        }

    }
}
