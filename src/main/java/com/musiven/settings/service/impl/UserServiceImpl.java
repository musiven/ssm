package com.musiven.settings.service.impl;

import com.musiven.settings.dao.UserDao;
import com.musiven.settings.domain.User;
import com.musiven.settings.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User login(String loginAct, String loginPwd, String ip) {
        User user = userDao.queryUser(loginAct,loginPwd);
        return user;
    }
}
