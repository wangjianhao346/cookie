package com.rain.cookie.request;

import javax.validation.constraints.NotBlank;

public class AddModuleRequest {

    @NotBlank
    private String moduleName;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
