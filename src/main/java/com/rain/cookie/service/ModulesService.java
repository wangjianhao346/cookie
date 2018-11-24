package com.rain.cookie.service;

import com.rain.cookie.dao.ModulesMapper;
import com.rain.cookie.entity.Modules;
import com.rain.cookie.entity.ModulesExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModulesService {
    @Resource
    private ModulesMapper modulesMapper;

    public List<Modules> getModules() {
        ModulesExample example = new ModulesExample();
        example.createCriteria();
        return modulesMapper.selectByExample(example);
    }
}
