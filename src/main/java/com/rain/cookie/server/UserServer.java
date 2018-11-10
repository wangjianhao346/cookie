package com.rain.cookie.server;

import com.rain.cookie.dao.UserMapper;
import com.rain.cookie.dto.UserDTO;
import com.rain.cookie.entry.UserExample;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServer {

    @Resource
    private UserMapper userMapper;

    public UserDTO getUser(int id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userMapper.selectByExample(example).get(0), userDTO);
        return userDTO;
    }
}
