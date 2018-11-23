package com.rain.cookie.request;

import javax.validation.constraints.NotNull;

public class DeleteArticleRequest {
    @NotNull
    private Integer pid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
