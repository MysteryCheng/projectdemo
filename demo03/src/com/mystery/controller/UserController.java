package com.mystery.controller;

import com.mystery.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userServcie;

    /*获取用户名，设置编码格式，不然数据传到前台显示问号*/
    @RequestMapping(value="/getUsername",produces = "text/plain;charset=utf-8")
    public String getUserName(ServletRequest request, ServletResponse response,Integer id){

        System.out.println(userServcie.getUserName(1));
        return userServcie.getUserName(1);

    }
}
