package com.dao;


import com.pojo.Student;

public interface StudentCheckLoginDao {
    Student StudentCheckLogin(String id_student, String pwd_student);
}
