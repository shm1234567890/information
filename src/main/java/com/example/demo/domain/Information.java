package com.example.demo.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Information implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private String replyCount;
    private String viewCount;
    private LocalDateTime reportTime;
    private LocalDateTime lastPostTime;


    public Information(Integer id) {
        this.id = id;
    }

    public Information() {
    }

    public Information(String title, String content, String replyCount, String viewCount, LocalDateTime reportTime, LocalDateTime lastPostTime) {
        this.title = title;
        this.content = content;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.reportTime = reportTime;
        this.lastPostTime = lastPostTime;
    }

    public Information(Integer id, String title, String content, String replyCount, String viewCount, LocalDateTime reportTime, LocalDateTime lastPostTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.reportTime = reportTime;
        this.lastPostTime = lastPostTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(String replyCount) {
        this.replyCount = replyCount;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public LocalDateTime getReportTime() {
        return reportTime;
    }

    public void setReportTime(LocalDateTime reportTime) {
        this.reportTime = reportTime;
    }

    public LocalDateTime getLastPostTime() {
        return lastPostTime;
    }

    public void setLastPostTime(LocalDateTime lastPostTime) {
        this.lastPostTime = lastPostTime;
    }

    @Override
    public String toString() {
        return "information{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", replyCount='" + replyCount + '\'' +
                ", viewCount='" + viewCount + '\'' +
                ", reportTime=" + reportTime +
                ", lastPostTime=" + lastPostTime +
                '}';
    }
}
