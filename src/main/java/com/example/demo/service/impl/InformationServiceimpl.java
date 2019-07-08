package com.example.demo.service.impl;

import com.example.demo.domain.Information;
import com.example.demo.mapper.InformationMapper;
import com.example.demo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceimpl implements InformationService {

    @Autowired
    InformationMapper informationMapper;

    @Override
    public List<Information> INFORMATIONfindAll() {
        return informationMapper.INFORMATIONfindAll();
    }

    @Override
    public Information INFORMATIONfindById(Integer id) {
        return informationMapper.INFORMATIONfindById(id);
    }

    @Override
    public int InFORMATIONupdate(Information information) {
        return informationMapper.InFORMATIONupdate(information);
    }
}
