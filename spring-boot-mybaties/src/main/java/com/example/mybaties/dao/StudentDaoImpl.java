package com.example.mybaties.dao;

import com.example.mybaties.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.Date;

/**
 * Created by anlu on 2017/5/8.
 */
public class StudentDaoImpl implements StudentDao {

    private SqlSession sqlSession;

    public StudentDaoImpl()throws Exception {

        String resource = "mapper/mybatis-config.xml";

        Reader reader = Resources.getResourceAsReader(resource);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        //用sqlSession factory 来创建session
       this.sqlSession = factory.openSession();
    }

    @Override
    public Student insertStudent(Student stu) {
        sqlSession.insert("insert",stu);
        sqlSession.commit();
        return stu;
    }

    @Override
    public void deleteStu(Integer stuId) {

    }

    @Override
    public Student updateStu(Integer stuId) {
        return null;
    }

    @Override
    public Student selectStu(Integer stuId) {
        return null;
    }
}
