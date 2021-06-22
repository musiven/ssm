package com.musiven.settings.service;

import com.musiven.settings.domain.User;

public interface UserService {
    User login(String loginAct, String loginPwd,String ip);
}
