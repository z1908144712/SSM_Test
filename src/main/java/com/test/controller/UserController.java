package com.test.controller;

import com.test.service.UserServcie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServcie userServcie;

    @RequestMapping("/showUser.do")
    public ModelAndView selectUser(long id){
        System.out.println("id:"+id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("user",userServcie.selectUser(id));
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
