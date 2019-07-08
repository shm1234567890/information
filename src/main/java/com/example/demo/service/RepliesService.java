package com.example.demo.service;

import com.example.demo.domain.Information;
import com.example.demo.domain.Replies;

import java.util.List;

public interface RepliesService {
    List<Replies> findAll(Integer id);
}
