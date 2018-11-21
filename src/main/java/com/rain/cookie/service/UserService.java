package com.rain.cookie.service;

import com.rain.cookie.dao.UserMapper;
import com.rain.cookie.entity.User;
import com.rain.cookie.entity.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUser(int id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.selectByExample(example).get(0);
    }
}
