package com.rain.cookie.controller;

import com.rain.cookie.request.ArticleRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "文章处理器")
@RequestMapping("/article")
@RestController
public class ArticleController {

    @ApiOperation("通过ModulesPid获取最近文章详情")
    @PostMapping(value = "{modulesPid}")
    public void getArticlesByModulesPid(@PathVariable("modulesPid") Integer modulesPid){

    }

    @ApiOperation("通过ArticlePid获取最近文章详情")
    @PostMapping(value = "/detail")
    public void getArticleByArticlePid(@RequestBody @Valid ArticleRequest request){

    }

    @ApiOperation("获取最近文章信息")
    @GetMapping(value = "/detail")
    public void test(){

    }
}
