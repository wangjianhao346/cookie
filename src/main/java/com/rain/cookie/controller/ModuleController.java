package com.rain.cookie.controller;

import com.rain.cookie.entity.Result;
import com.rain.cookie.request.AddModuleRequest;
import com.rain.cookie.request.UpdateModuleRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "导航")
@RequestMapping("/module")
@RestController
public class ModuleController {

    @ApiOperation("修改导航模块")
    @PostMapping
    public Result editModule(@RequestBody @Valid UpdateModuleRequest request) {
        return null;
    }

    @ApiOperation("添加导航模块")
    @PostMapping("addModule")
    public Result addModule(@RequestBody @Valid AddModuleRequest request) {
        return null;
    }

    @ApiOperation("删除导航模块")
    @DeleteMapping("{pid}")
    public Result deleteModule(@PathVariable("pid") Integer pid) {
        return null;
    }
}
