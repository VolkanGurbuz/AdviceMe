package com.volkangurbuz.adviceme.Model;

/**
 * Created by VolkanGurbuz on 3/4/2018.
 */

public class Article {

    private int articleId;
    private String title, details;
    private int thumbnail;

    public Article() {
    }

    public Article(int articleId, String title, String details, int thumbnail) {
        this.articleId = articleId;
        this.title = title;
        this.details = details;
        this.thumbnail = thumbnail;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
