package com.rain.cookie.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "导航")
@RequestMapping("/module")
@RestController
public class ModuleController {

//    @ApiOperation("修改导航模块")
//    @PostMapping
//    public Result editModule(@RequestBody @Valid UpdateModuleRequest request) {
//        return null;
//    }
//
//    @ApiOperation("添加导航模块")
//    @PostMapping("addModule")
//    public Result addModule(@RequestBody @Valid AddModuleRequest request) {
//        return null;
//    }
//
//    @ApiOperation("删除导航模块")
//    @DeleteMapping("{pid}")
//    public Result deleteModule(@PathVariable("pid") Integer pid) {
//        return null;
//    }
}
