package com.example.mybaties.Controller;

import com.example.mybaties.model.MyPro;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anlu on 2017/5/8.
 */

@RestController
public class TestController {

    @Autowired
    private MyPro pro;

    @GetMapping(value = "/name")
    public String test1(){
        return  pro.getName();
    }

    @GetMapping(value = "/view")
    public String doView(){
        return "index";
    }



}
