package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUSer();
    }
}
