package com.dao;

import com.pojo.Pl;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pl record);

    int insertSelective(Pl record);

    Pl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pl record);

    int updateByPrimaryKey(Pl record);
}
