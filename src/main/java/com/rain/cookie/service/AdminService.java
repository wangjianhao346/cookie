package com.rain.cookie.service;

import com.rain.cookie.dao.AdminMapper;
import com.rain.cookie.entity.Admin;
import com.rain.cookie.entity.AdminExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin getAdmin() {
        AdminExample example = new AdminExample();
        example.createCriteria();
        return adminMapper.selectByExample(example).get(0);
    }
}
