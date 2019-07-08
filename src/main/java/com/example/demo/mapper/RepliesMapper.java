package com.example.demo.mapper;

import com.example.demo.domain.Information;
import com.example.demo.domain.Replies;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface RepliesMapper {

    List<Replies> findAll(Integer id);

    int save(Replies replies);

}
