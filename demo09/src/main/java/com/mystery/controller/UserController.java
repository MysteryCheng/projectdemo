package com.mystery.controller;

import com.mystery.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userServcie;

    /*获取用户名*/
    @RequestMapping("/getUsername")
    public String getUserName(Integer id){
        System.out.println(userServcie.getUserName(1));
        return "springboot:"+userServcie.getUserName(1);
    }
}
