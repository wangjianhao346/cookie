package com.rain.cookie.dao;

import com.rain.cookie.entity.Modules;
import com.rain.cookie.entity.ModulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModulesMapper {
    long countByExample(ModulesExample example);

    int deleteByExample(ModulesExample example);

    int insert(Modules record);

    int insertSelective(Modules record);

    List<Modules> selectByExample(ModulesExample example);

    int updateByExampleSelective(@Param("record") Modules record, @Param("example") ModulesExample example);

    int updateByExample(@Param("record") Modules record, @Param("example") ModulesExample example);
}