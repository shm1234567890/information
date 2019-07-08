package com.example.demo.mapper;

import com.example.demo.domain.Information;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;


@Mapper
public interface InformationMapper {

    List<Information> INFORMATIONfindAll();

    Information INFORMATIONfindById(Integer id);

    int InFORMATIONupdate(Information information);

}
