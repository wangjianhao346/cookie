package com.rain.cookie.server;

import com.rain.cookie.dao.UserMapper;
import com.rain.cookie.entry.User;
import com.rain.cookie.entry.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServer {

    @Resource
    private UserMapper userMapper;

    public User getUser(int id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        System.out.println(userMapper.selectByExample(example).get(0));
        return userMapper.selectByExample(example).get(0);
    }
}
