package com.mayi.ssm.service.impl;

import com.mayi.ssm.dao.IUserDao;
import com.mayi.ssm.model.UserModel;
import com.mayi.ssm.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService{

    @Resource
    private IUserDao userDao;
    // 声明一个Logger，这个是static的方式
    private final static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Override
    public List<UserModel> getUsers() {
        logger.debug("getUsers is begin...");
        return userDao.getUsers();
    }
}
