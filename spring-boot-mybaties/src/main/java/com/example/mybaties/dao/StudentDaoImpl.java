package com.example.mybaties.dao;

import com.example.mybaties.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.Reader;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anlu on 2017/5/8.
 */
@Component
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

        Student stu = new Student();
        Student student = sqlSession.selectOne("selectStudent",stu);
        return student;
    }

    @Override
    public List<Student> findStuByPage(Integer pageNum, Integer pageSize) {

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("start",pageNum);
        map.put("pagesize",pageSize);
        List<Student> list = sqlSession.selectList("com.example.mybaties.model.Student.findStuByPage",map);
        return list;
    }
}
