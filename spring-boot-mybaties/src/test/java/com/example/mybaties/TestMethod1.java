package com.example.mybaties;

import com.example.mybaties.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;


/**
 * Created by anlu on 2017/5/8.
 */
public class TestMethod1 {
    private SqlSession sqlSession;

    @Before
    public void prepare()throws IOException{
        String resource = "mapper/mybatis-config.xml";

        Reader reader = Resources.getResourceAsReader(resource);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        //用sqlSession factory 来创建session
        sqlSession = factory.openSession();
    }

    @Test
    public void testInsert(){
        Student stu = new Student();
        stu.setStuNum("9001");
        stu.setSchool("肥乡一中");
        stu.setEnterTime(new Date());
        sqlSession.insert("insert",stu);

    }

    @Test
    public void testSelect(){

        Student stu = new Student();
        stu.setId(7);

       Student student = sqlSession.selectOne("selectStudent",stu);
       System.out.println(student.toString());
    }



    @After
    public void after(){
        sqlSession.commit();
    }
}
