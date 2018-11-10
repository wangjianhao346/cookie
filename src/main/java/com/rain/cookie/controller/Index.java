package com.rain.cookie.controller;

import com.rain.cookie.dto.UserDTO;
import com.rain.cookie.server.UserServer;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class Index {
    @Resource
    private UserServer userServer;

    @ApiOperation("根据id查找用户信息")
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public UserDTO test(@PathVariable("id") int id) {
        return userServer.getUser(id);
    }
}
