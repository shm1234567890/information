package com.example.demo.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Replies {
    private Integer id;
    private String content;
    private LocalDateTime replyTime;
    private Integer infoId;
    private Information information;

    public Replies() {
    }

    public Replies(String content, LocalDateTime replyTime, Integer infoId, Information information) {
        this.content = content;
        this.replyTime = replyTime;
        this.infoId = infoId;
        this.information = information;
    }

    public Replies(Integer id, String content, LocalDateTime replyTime, Integer infoId, Information information) {
        this.id = id;
        this.content = content;
        this.replyTime = replyTime;
        this.infoId = infoId;
        this.information = information;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(LocalDateTime replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Replies{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", replyTime=" + replyTime +
                ", infoId=" + infoId +
                '}';
    }
}
