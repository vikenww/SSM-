package com.pojo;

public class ScoreTable {
    private String id_student;
    private String name_student;
    private int chinese;
    private int math;
    private int english;
    private int python;
    private int java;

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    @Override
    public String toString() {
        return "ScoreTable{" +
                "id_student='" + id_student + '\'' +
                ", name_student='" + name_student + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", python=" + python +
                ", java=" + java +
                '}';
    }
}

