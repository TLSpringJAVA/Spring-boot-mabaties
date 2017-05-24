package com.example.mybaties.dao;

import com.example.mybaties.model.Student;

/**
 * Created by anlu on 2017/5/8.
 */
public interface StudentDao {
    public Student insertStudent(Student stu);

    public void deleteStu(Integer stuId);

    public Student updateStu(Integer stuId);

    public Student selectStu(Integer stuId);
}
