package com.rain.cookie.controller;

import com.rain.cookie.converter.AdminConverter;
import com.rain.cookie.converter.ArticleConverter;
import com.rain.cookie.converter.ModuleConverter;
import com.rain.cookie.dto.AdminDTO;
import com.rain.cookie.dto.ArticleDTO;
import com.rain.cookie.dto.ModulesDTO;
import com.rain.cookie.service.AdminService;
import com.rain.cookie.service.ArticleService;
import com.rain.cookie.service.ModulesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
@Api(tags = "主页")
public class MainController {
    @Resource
    private AdminService adminService;
    @Resource
    private ArticleService articleService;
    @Resource
    private ModulesService modulesService;

    @ApiOperation("获取管模块信息")
    @GetMapping(value = "module")
    public List<ModulesDTO> getModules() {
        return ModuleConverter.convert(modulesService.getModules());
    }

    @ApiOperation("获取管理员信息")
    @GetMapping(value = "admin")
    public AdminDTO getAdmin() {
        return AdminConverter.convert(adminService.getAdmin());
    }

    @ApiOperation("获取最近文章信息")
    @GetMapping(value = "recentArticle")
    public List<ArticleDTO> getRecentArticles(){
        return ArticleConverter.convert(articleService.getRecentArticles());
    }

}
