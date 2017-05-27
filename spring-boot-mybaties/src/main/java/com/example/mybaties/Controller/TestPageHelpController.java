package com.example.mybaties.Controller;

import com.alibaba.fastjson.JSON;
import com.example.mybaties.dao.StudentDao;
import com.example.mybaties.dao.StudentDaoImpl;
import com.example.mybaties.model.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.generate.test.mapper.StudentMapper;
import org.generate.test.model.StudentExample;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Andrew on 2017/5/27.
 */
@RestController
@RequestMapping(value = "/pagehelper")
public class TestPageHelpController {

    private Integer pageNum;
    private Integer pageSize;

//    @Autowired
//    private StudentDaoImpl studentDao;

    @Autowired
    private StudentMapper studentMapper;

    @PostMapping(value = "/generate/findStudent")
    public String findStudent(Integer pageNum,Integer pageSize){
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 10 : pageSize;
        PageHelper.startPage(pageNum, pageSize);
        List<org.generate.test.model.Student> list = studentMapper.selectByExample(new StudentExample());
        PageInfo pageInfo = new PageInfo(list);
        Page page = (Page) list;
        return "PageInfo: " + JSON.toJSONString(pageInfo) + ", Page: " + JSON.toJSONString(page);
    }

//    @RequestMapping(value = "/findStu")
//    public String findStu(HttpServletRequest request,Integer pageNum,Integer pageSize){
//
//        pageNum = pageNum == null?1:pageNum;
//
//        pageSize = pageSize == null?10:pageSize;
//        PageHelper.startPage(pageNum,pageSize);
//
//        List<Student> list = studentDao.findStuByPage(pageNum,pageSize);
//        System.out.println(list);
//
//        PageInfo pageInfo = new PageInfo(list);
//
//        return "PageInfo: " + JSON.toJSONString(pageInfo)+"list:"+list ;
//    }



}
