package com.example.demo.service;

import com.example.demo.domain.Information;

import java.util.List;

public interface InformationService {
    List<Information> INFORMATIONfindAll();
    Information INFORMATIONfindById(Integer id);
    int InFORMATIONupdate(Information information);
}
