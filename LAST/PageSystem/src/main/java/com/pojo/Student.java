package com.pojo;

public class Student {
    private String idstudent;
    private String namestudent;
    private String pwdstudent;

    public String getId_student() {
        return idstudent;
    }

    public void setId_student(String id_student) {
        this.idstudent = id_student;
    }

    public String getName_student() {
        return namestudent;
    }

    public void setName_student(String name_student) {
        this.namestudent = name_student;
    }

    public String getPwd_student() {
        return pwdstudent;
    }

    public void setPwd_student(String pwd_student) {
        this.pwdstudent = pwd_student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student='" + idstudent + '\'' +
                ", name_student='" + namestudent + '\'' +
                ", pwd_student='" + pwdstudent + '\'' +
                '}';
    }
}
