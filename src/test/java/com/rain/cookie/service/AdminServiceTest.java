package com.rain.cookie.service;

import com.rain.cookie.SpringTest;
import org.junit.Test;

import javax.annotation.Resource;


public class AdminServiceTest extends SpringTest {
    @Resource
    private AdminService adminService;

    @Test
    public void testGetAdmin() {
        System.out.println(adminService.getAdmin());
    }
}