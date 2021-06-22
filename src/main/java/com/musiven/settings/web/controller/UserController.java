package com.musiven.settings.web.controller;

import com.musiven.settings.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/settings/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model, String loginAct, String loginPwd, HttpServletRequest request){

        return "/success.jsp";
    }
}
