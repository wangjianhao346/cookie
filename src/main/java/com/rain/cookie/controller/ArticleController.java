package com.rain.cookie.controller;

import com.github.pagehelper.PageInfo;
import com.rain.cookie.dto.ArticleDTO;
import com.rain.cookie.entity.Result;
import com.rain.cookie.request.AddArticleRequest;
import com.rain.cookie.request.ArticleRequest;
import com.rain.cookie.request.DeleteArticleRequest;
import com.rain.cookie.request.EditArticleRequest;
import com.rain.cookie.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Api(tags = "文章")
@RequestMapping("/article")
@RestController
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @ApiOperation("获取文章列表")
    @PostMapping
    public PageInfo<ArticleDTO> getArticlesByModulesPid(@RequestBody @Valid ArticleRequest request) {
        return null;
    }

    @ApiOperation("通过ArticlePid获取文章详情")
    @GetMapping(value = "{articlePid}/detail")
    public Result getArticleByArticlePid(@PathVariable("articlePid") Integer articlePid) {
        return null;
    }

    @ApiOperation("添加文章")
    @PostMapping(value = "add")
    public Result addArticle(@RequestBody @Valid AddArticleRequest request) {
        return null;
    }

    @ApiOperation("删除文章")
    @DeleteMapping
    public Result deleteArticle(@RequestBody @Valid DeleteArticleRequest request) {
        return null;
    }

    @ApiOperation("批量删除文章")
    @DeleteMapping("/batch")
    public Result deleteArticles(@RequestBody @Valid List<Integer> pidList) {
        return null;
    }

    @ApiOperation("修改文章")
    @PutMapping
    public Result editArticle(@RequestBody @Valid EditArticleRequest request) {
        return null;
    }
}
