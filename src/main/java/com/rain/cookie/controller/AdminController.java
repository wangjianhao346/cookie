package com.rain.cookie.controller;

import com.rain.cookie.entity.Result;
import com.rain.cookie.request.UpdateAdminRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "管理")
@RequestMapping("/admin")
@RestController
public class AdminController {

    @ApiOperation("修改管理员信息")
    @PostMapping
    public Result updateAdminInfo(@RequestBody @Valid UpdateAdminRequest request){
        return null;
    }
}
