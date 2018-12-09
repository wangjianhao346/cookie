package com.rain.cookie.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(tags = "主页")
public class MainController {
//    @Resource
//    private AdminService adminService;
//    @Resource
//    private ArticleService articleService;
//    @Resource
//    private ModulesService modulesService;
//
//    @ApiOperation("获取管模块信息")
//    @GetMapping(value = "module")
//    public List<ModulesDTO> getModules() {
//        return ModuleConverter.convert(modulesService.getModules());
//    }
//
//    @ApiOperation("获取管理员信息")
//    @GetMapping(value = "admin")
//    public AdminDTO getAdmin() {
//        return AdminConverter.convert(adminService.getAdmin());
//    }
//
//    @ApiOperation("获取最近文章信息")
//    @GetMapping(value = "recentArticle")
//    public List<ArticleDTO> getRecentArticles() {
//        return ArticleConverter.convert(articleService.getRecentArticles());
//    }

}
