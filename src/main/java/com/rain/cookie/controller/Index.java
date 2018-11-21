package com.rain.cookie.controller;

import com.rain.cookie.dto.UserDTO;
import com.rain.cookie.entity.Result;
import com.rain.cookie.entity.ResultBuilder;
import com.rain.cookie.entity.User;
import com.rain.cookie.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "Index", tags = {"初始化处理器"})
public class Index {
    @Resource
    private UserService userService;

    @ApiOperation("根据User查找用户信息")
    @PostMapping
    public UserDTO test(@RequestBody User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userService.getUser(user.getId()), userDTO);
        return userDTO;
    }

    @ApiOperation("根据id查找用户信息")
    @PostMapping(value = "{id}")
    public Result<UserDTO> test2(@PathVariable("id") int id) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userService.getUser(id), userDTO);
        return ResultBuilder.success(userDTO);
    }
}
