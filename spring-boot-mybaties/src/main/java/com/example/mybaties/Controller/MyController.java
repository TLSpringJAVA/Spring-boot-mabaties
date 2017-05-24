package com.example.mybaties.Controller;

import com.example.mybaties.dao.StudentDaoImpl;
import com.example.mybaties.model.Student;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created by anlu on 2017/5/5.
 */
@RestController
public class MyController {

    @GetMapping(value = "/test1")
    public String test1(){
        return "Hello world";
    }

    @GetMapping(value = "/test2")
    public ArrayList<Student> test2(){
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student();
        stu1.setSchool("南开中学");
        stu1.setStuNum("001");

        list.add(stu1);
        return list;

    }

    @RequestMapping(value = "/insertStu",method = RequestMethod.POST)
    public void insertStu(@RequestBody Student student){

        StudentDaoImpl stuDao = null;
        try {
            stuDao = new StudentDaoImpl();
            Student stu = stuDao.insertStudent(student);
            System.out.println(stu.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping(value = "/insertStu2")
    public void insertStu2(String school,String stuNum){
        StudentDaoImpl stuDao = null;
        try {
            stuDao = new StudentDaoImpl();
            Student stu = new Student();
            stu.setSchool(school);
            stu.setStuNum(stuNum);
            stuDao.insertStudent(stu);
            System.out.println(stu.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/insertStu1",method = RequestMethod.POST)
    public void insertStu1(@RequestParam("school")String school,@RequestParam("stuNum")String stuNum){

        StudentDaoImpl stuDao = null;
        try {
            stuDao = new StudentDaoImpl();


            Student stu = new Student();
            stu.setSchool(school);
            stu.setStuNum(stuNum);
            stuDao.insertStudent(stu);
            System.out.println(stu.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }

     }

}
