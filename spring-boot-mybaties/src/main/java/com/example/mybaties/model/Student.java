package com.example.mybaties.model;

import java.util.Date;

/**
 * Created by anlu on 2017/5/5.
 */
public class Student {
    private Integer id;
    private String school;
    private String stuNum;
    private Date enterTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", school='" + school + '\'' +
                ", stuNum='" + stuNum + '\'' +
                ", enterTime=" + enterTime +
                '}';
    }
}
