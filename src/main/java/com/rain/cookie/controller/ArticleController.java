package com.rain.cookie.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "文章")
@RequestMapping("/article")
@RestController
public class ArticleController {
//    @Resource
//    private ArticleService articleService;
//
//    @ApiOperation("获取文章列表")
//    @PostMapping
//    public PageInfo<ArticleDTO> getArticlesByModulesPid(@RequestBody @Valid ArticleRequest request) {
//        return ArticleConverter.convert(articleService.getArticlesByModulesPid(request));
//    }
//
//    @ApiOperation("通过ArticlePid获取文章详情")
//    @GetMapping(value = "{articlePid}/detail")
//    public Article getArticleByArticlePid(@PathVariable("articlePid") Integer articlePid) {
//        return articleService.getArticleByArticlePid(articlePid);
//    }
//
//    @ApiOperation("添加文章")
//    @PostMapping(value = "add")
//    public Result addArticle(@RequestBody @Valid AddArticleRequest request) {
//        return null;
//    }
//
//    @ApiOperation("删除文章")
//    @DeleteMapping
//    public Result deleteArticle(@RequestBody @Valid DeleteArticleRequest request) {
//        return null;
//    }
//
//    @ApiOperation("批量删除文章")
//    @DeleteMapping("/batch")
//    public Result deleteArticles(@RequestBody @Valid List<Integer> pidList) {
//        return null;
//    }
//
//    @ApiOperation("修改文章")
//    @PutMapping
//    public Result editArticle(@RequestBody @Valid EditArticleRequest request) {
//        return null;
//    }
}
