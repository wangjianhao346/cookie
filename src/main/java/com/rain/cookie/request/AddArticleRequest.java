package com.rain.cookie.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddArticleRequest {

    @NotBlank
    private String articleTitle;

    @NotNull
    private Integer moduleId;

    @NotBlank
    private String author;

    @NotBlank
    private String articleContent;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
