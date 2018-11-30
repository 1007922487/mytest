package com.jinse.controller;

import com.jinse.entity.Account;
import com.jinse.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //加入ioc容器
@RequestMapping("/account")
public class AccountController {
    /**
     * 原本在这注入IAccountService会报错
     * 因为在项目启动的时候web.xml只加载了一个SpringMVC.xml的配置 文件
     * 需要在web.xml中配置让项目启动的时候加载applicationContext.xml
     */
    @Autowired
    private IAccountService accountService;
    /**
     * 查询全部
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        //调用service(如果成功，说明Spring整合SpringMVC成功!)
        List<Account> list = accountService.findAll();
        //设置要跳转的网页名称
        modelAndView.setViewName("list");
        //存储到请求域中
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
