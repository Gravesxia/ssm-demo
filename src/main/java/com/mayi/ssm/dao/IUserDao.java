package com.mayi.ssm.dao;

import com.mayi.ssm.model.UserModel;

import java.util.List;

public interface IUserDao {
    List<UserModel> getUsers();
}
