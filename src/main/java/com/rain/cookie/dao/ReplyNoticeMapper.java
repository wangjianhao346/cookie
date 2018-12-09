package com.rain.cookie.dao;

import com.rain.cookie.entity.ReplyNotice;
import com.rain.cookie.entity.ReplyNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyNoticeMapper {
    long countByExample(ReplyNoticeExample example);

    int deleteByExample(ReplyNoticeExample example);

    int insert(ReplyNotice record);

    int insertSelective(ReplyNotice record);

    List<ReplyNotice> selectByExample(ReplyNoticeExample example);

    int updateByExampleSelective(@Param("record") ReplyNotice record, @Param("example") ReplyNoticeExample example);

    int updateByExample(@Param("record") ReplyNotice record, @Param("example") ReplyNoticeExample example);
}