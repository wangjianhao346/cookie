package com.rain.cookie.converter;

import com.github.pagehelper.PageInfo;
import com.rain.cookie.dto.ArticleDTO;
import com.rain.cookie.entity.Article;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleConverter {
    public static List<ArticleDTO> convert(List<Article> articles) {
        List<ArticleDTO> articleDTOList = new ArrayList<>();
        for (Article a : articles) {
            ArticleDTO articleDTO = new ArticleDTO();
            BeanUtils.copyProperties(a, articleDTO);
            articleDTOList.add(articleDTO);
        }
        return articleDTOList;
    }

    public static PageInfo<ArticleDTO> convert(PageInfo<Article> articlePageInfo) {
        PageInfo<ArticleDTO> articleDTOPageInfo = new PageInfo<>();
        List<ArticleDTO> articleDTOList = new ArrayList<>();
        BeanUtils.copyProperties(articlePageInfo, articleDTOPageInfo);
        for (Article a : articlePageInfo.getList()) {
            ArticleDTO articleDTO = new ArticleDTO();
            BeanUtils.copyProperties(a, articleDTO);
            articleDTOList.add(articleDTO);
        }
        articleDTOPageInfo.setList(articleDTOList);
        return articleDTOPageInfo;
    }
}
