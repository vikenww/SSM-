package com.pojo;

public class Teacher {
    private String id_teacher;
    private String name_teacher;
    private String pwd_teacher;
    private int id_course;

    public String getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(String id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getName_teacher() {
        return name_teacher;
    }

    public void setName_teacher(String name_teacher) {
        this.name_teacher = name_teacher;
    }

    public String getPwd_teacher() {
        return pwd_teacher;
    }

    public void setPwd_teacher(String pwd_teacher) {
        this.pwd_teacher = pwd_teacher;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id_teacher='" + id_teacher + '\'' +
                ", name_teacher='" + name_teacher + '\'' +
                ", pwd_teacher='" + pwd_teacher + '\'' +
                ", id_course=" + id_course +
                '}';
    }
}