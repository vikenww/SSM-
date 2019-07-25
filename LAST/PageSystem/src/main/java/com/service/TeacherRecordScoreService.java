package com.service;


import com.pojo.ScoreTable;

import java.util.List;

/**
 * 老师录分，如果录分成功，返回success
 * 如果失败，返回fail
 */
public interface TeacherRecordScoreService {
    public String RecordingScore(List<ScoreTable> scoreTableList);
}
