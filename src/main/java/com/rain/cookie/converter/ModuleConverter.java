package com.rain.cookie.converter;

import com.rain.cookie.dto.ModulesDTO;
import com.rain.cookie.entity.Modules;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ModuleConverter {
    public static List<ModulesDTO> convert(List<Modules> modulesList) {
        List<ModulesDTO> modulesDTOList = new ArrayList<>();
        for (Modules modules : modulesList) {
            ModulesDTO modulesDTO = new ModulesDTO();
            BeanUtils.copyProperties(modules, modulesDTO);
            modulesDTOList.add(modulesDTO);
        }
        return modulesDTOList;
    }
}
