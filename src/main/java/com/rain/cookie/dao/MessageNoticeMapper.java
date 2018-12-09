package com.rain.cookie.dao;

import com.rain.cookie.entity.MessageNotice;
import com.rain.cookie.entity.MessageNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageNoticeMapper {
    long countByExample(MessageNoticeExample example);

    int deleteByExample(MessageNoticeExample example);

    int insert(MessageNotice record);

    int insertSelective(MessageNotice record);

    List<MessageNotice> selectByExample(MessageNoticeExample example);

    int updateByExampleSelective(@Param("record") MessageNotice record, @Param("example") MessageNoticeExample example);

    int updateByExample(@Param("record") MessageNotice record, @Param("example") MessageNoticeExample example);
}