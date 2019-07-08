package com.example.demo.service.impl;


import com.example.demo.domain.Information;
import com.example.demo.domain.Replies;
import com.example.demo.mapper.RepliesMapper;
import com.example.demo.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepliesServiceimpl implements RepliesService {

    @Autowired
    RepliesMapper repliesMapper;

    @Override
    public List<Replies> findAll(Integer id) {
        return repliesMapper.findAll(id);
    }
}
