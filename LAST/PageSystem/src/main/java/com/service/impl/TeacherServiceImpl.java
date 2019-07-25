package com.service.impl;
import com.pojo.ScoreTable;
import com.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Override
    public List<ScoreTable> checkScore(String teacherid) {
        return null;
    }

    @Override
    public List<ScoreTable> Recording(String teacherid) {
        return null;
    }
}
