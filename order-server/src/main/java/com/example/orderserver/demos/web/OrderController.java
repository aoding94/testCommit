package com.example.orderserver.demos.web;

import com.example.serverapi.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @DubboReference
    private UserService userService;

    @GetMapping("createOrder")
    public String createOrder(Integer id){

        String userName = userService.getUserById(id);
        return userName + " createOrder success";

    }


}
