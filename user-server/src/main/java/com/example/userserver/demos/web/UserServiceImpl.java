package com.example.userserver.demos.web;


import com.example.serverapi.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements UserService {


    @Override
    public String getUserById(Integer id){
        return "用户" + id;
    }

}
