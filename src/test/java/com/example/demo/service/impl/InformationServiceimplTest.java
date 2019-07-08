package com.example.demo.service.impl;

import com.example.demo.mapper.InformationMapper;
import com.example.demo.mapper.RepliesMapper;
import com.example.demo.service.RepliesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InformationServiceimplTest {
    @Autowired
    InformationMapper informationMapper;

    @Autowired
    RepliesService repliesService;


    @Test
    public void aa(){
        System.out.println(informationMapper.INFORMATIONfindById(1));
        repliesService.findAll(1).forEach(System.out::println);
    }

}