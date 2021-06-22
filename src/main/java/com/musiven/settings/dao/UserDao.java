package com.musiven.settings.dao;

import com.musiven.settings.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User queryUser(@Param("loginAct")String loginAct,
                   @Param("loginPwd")String loginPwd);
}
