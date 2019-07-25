package com.service;


import com.pojo.ScoreTable;

import java.util.List;

public interface TeacherService {
    /**
     * 老师查看本班学生的成绩
     * 最后返回一个表的实体对象
     * @returnScoreTable
     */
    public List<ScoreTable>  checkScore(String teacherid);

    /**
     * 老师将本班的成绩录进成绩表
     * 成功录进返回success
     * 失败返回fail
     * @return
     */
    public List<ScoreTable> Recording(String teacherid);
}
