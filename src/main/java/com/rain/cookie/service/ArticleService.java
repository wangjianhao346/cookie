package com.rain.cookie.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rain.cookie.dao.ArticleMapper;
import com.rain.cookie.entity.Article;
import com.rain.cookie.entity.ArticleExample;
import com.rain.cookie.request.ArticleRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    public List<Article> getRecentArticles() {
        ArticleExample example = new ArticleExample();
        example.setDistinct(true);
        example.createCriteria();
        // 只要最新的十篇文章
        PageHelper.startPage(1, 10);
        List<Article> articles = articleMapper.selectByExample(example);
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        return pageInfo.getList();
    }

    public PageInfo<Article> getArticlesByModulesPid(ArticleRequest request) {
        ArticleExample example = new ArticleExample();
        example.createCriteria().andModuleIdEqualTo(request.getModuleId()).andIsDeleteEqualTo("N");
        PageHelper.startPage(request.getStart(), request.getPageSize());
        List<Article> articles = articleMapper.selectByExample(example);
        return new PageInfo<>(articles);
    }

    public Article getArticleByArticlePid(Integer articlePid) {
        ArticleExample example = new ArticleExample();
        example.createCriteria().andPidEqualTo(articlePid);
        return articleMapper.selectByExample(example).get(0);
    }

}
