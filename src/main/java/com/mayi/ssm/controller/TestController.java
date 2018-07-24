package com.mayi.ssm.controller;

import com.mayi.ssm.model.UserModel;
import com.mayi.ssm.service.IUserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;

@RestController
public class TestController {

    @Autowired
    IUserService userService;


    @RequestMapping("/test")
    public String test(){
        return "This is test Api";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Map<String,Object> getUsers(){
        List<UserModel> users = userService.getUsers();
        Map<String,Object> map = new HashMap<>();
        map.put("users",users);
        return map;
    }
}
