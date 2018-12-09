package com.rain.cookie.dao;

import com.rain.cookie.entity.MessageBoard;
import com.rain.cookie.entity.MessageBoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageBoardMapper {
    long countByExample(MessageBoardExample example);

    int deleteByExample(MessageBoardExample example);

    int insert(MessageBoard record);

    int insertSelective(MessageBoard record);

    List<MessageBoard> selectByExample(MessageBoardExample example);

    int updateByExampleSelective(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByExample(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);
}