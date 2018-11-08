package com.rain.cookie.controller;

import com.rain.cookie.entry.User;
import com.rain.cookie.server.UserServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class Index {
    @Resource
    private UserServer userServer;

    @RequestMapping("hello")
    public User test() {
        return userServer.getUser();
    }
}
