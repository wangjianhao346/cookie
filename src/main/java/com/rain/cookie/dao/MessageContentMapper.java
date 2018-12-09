package com.rain.cookie.dao;

import com.rain.cookie.entity.MessageContent;
import com.rain.cookie.entity.MessageContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageContentMapper {
    long countByExample(MessageContentExample example);

    int deleteByExample(MessageContentExample example);

    int insert(MessageContent record);

    int insertSelective(MessageContent record);

    List<MessageContent> selectByExampleWithBLOBs(MessageContentExample example);

    List<MessageContent> selectByExample(MessageContentExample example);

    int updateByExampleSelective(@Param("record") MessageContent record, @Param("example") MessageContentExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageContent record, @Param("example") MessageContentExample example);

    int updateByExample(@Param("record") MessageContent record, @Param("example") MessageContentExample example);
}