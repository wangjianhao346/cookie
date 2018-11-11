package com.rain.cookie.controller;

import com.rain.cookie.dto.UserDTO;
import com.rain.cookie.entity.User;
import com.rain.cookie.server.UserServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "Index", tags = {"初始化处理器"})
public class Index {
    @Resource
    private UserServer userServer;

    @ApiOperation("根据User查找用户信息")
    @RequestMapping(method = RequestMethod.POST)
    public UserDTO test(@RequestBody User user) {
        System.out.println(userServer.getUser(user.getId()).toString());
        System.out.println("test1");
        return userServer.getUser(user.getId());
    }

    @ApiOperation("根据id查找用户信息")
    @RequestMapping(value = "{id}", method = RequestMethod.POST)
    public UserDTO test2(@PathVariable("id") int id) {
        System.out.println(userServer.getUser(id).toString());
        System.out.println("test2");
        return userServer.getUser(id);
    }
}
