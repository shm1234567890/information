package com.example.demo.service.impl;

import com.example.demo.domain.Information;
import com.example.demo.domain.Replies;
import com.example.demo.mapper.InformationMapper;
import com.example.demo.mapper.RepliesMapper;
import com.example.demo.service.SaveReplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class SaveRepliesimpl implements SaveReplies {

    @Autowired
    InformationMapper informationMapper;

    @Autowired
    RepliesMapper repliesMapper;


    @Transactional//用于同时提交事务，如其中一个提交失败则返回false
    public Boolean save(Replies replies) {
        LocalDateTime localDateTime=LocalDateTime.now();
        replies.setReplyTime(localDateTime);
        int insertReplies=repliesMapper.save(replies);

        Information information=new Information();
        information.setId(replies.getInformation().getId());
        information.setLastPostTime(localDateTime);
        int updateReplies = informationMapper.InFORMATIONupdate(information);

        if(insertReplies > 0 && updateReplies > 0){
            return true;
        }else
            return false;
    }
}
