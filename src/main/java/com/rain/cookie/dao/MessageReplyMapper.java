package com.rain.cookie.dao;

import com.rain.cookie.entity.MessageReply;
import com.rain.cookie.entity.MessageReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageReplyMapper {
    long countByExample(MessageReplyExample example);

    int deleteByExample(MessageReplyExample example);

    int insert(MessageReply record);

    int insertSelective(MessageReply record);

    List<MessageReply> selectByExample(MessageReplyExample example);

    int updateByExampleSelective(@Param("record") MessageReply record, @Param("example") MessageReplyExample example);

    int updateByExample(@Param("record") MessageReply record, @Param("example") MessageReplyExample example);
}