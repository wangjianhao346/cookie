package com.rain.cookie.dao;

import com.rain.cookie.entity.ArticleContent;
import com.rain.cookie.entity.ArticleContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleContentMapper {
    long countByExample(ArticleContentExample example);

    int deleteByExample(ArticleContentExample example);

    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    List<ArticleContent> selectByExample(ArticleContentExample example);

    int updateByExampleSelective(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    int updateByExample(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);
}