package com.example.mybaties.dao;

import com.example.mybaties.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anlu on 2017/5/8.
 */
@Component
public interface StudentDao {
    public Student insertStudent(Student stu);

    public void deleteStu(Integer stuId);

    public Student updateStu(Integer stuId);

    public Student selectStu(Integer stuId);

    public List<Student> findStuByPage(Integer pageNum,Integer pageSize);
}
