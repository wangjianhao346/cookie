package com.rain.cookie.entity;

public class Modules {
    private Integer pid;

    private String moduleName;

    private String isDelete;

    private Integer articleAmount;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Integer getArticleAmount() {
        return articleAmount;
    }

    public void setArticleAmount(Integer articleAmount) {
        this.articleAmount = articleAmount;
    }
}