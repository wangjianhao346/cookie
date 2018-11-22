package com.rain.cookie.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rain.cookie.dao.ArticleMapper;
import com.rain.cookie.entity.Article;
import com.rain.cookie.entity.ArticleExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    public List<Article> getRecentArticles(){
        ArticleExample example = new ArticleExample();
        example.setDistinct(true);
        example.createCriteria();
        // 只要最新的十篇文章
        PageHelper.startPage(1, 2);
        List<Article> articles = articleMapper.selectByExample(example);
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        return pageInfo.getList();
    }
}
