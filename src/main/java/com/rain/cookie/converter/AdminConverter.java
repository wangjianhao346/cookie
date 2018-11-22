package com.rain.cookie.converter;

import com.rain.cookie.dto.AdminDTO;
import com.rain.cookie.entity.Admin;
import org.springframework.beans.BeanUtils;

public class AdminConverter {
    public static AdminDTO convert(Admin admin){
        AdminDTO adminDTO = new AdminDTO();
        BeanUtils.copyProperties(admin, adminDTO);
        return adminDTO;
    }
}
