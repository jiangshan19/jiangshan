package com.service;

import com.pojo.Pl;

public interface PlService {
    int deleteByPrimaryKey(Integer id);

    int insert(Pl record);

    int insertSelective(Pl record);

    Pl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pl record);

    int updateByPrimaryKey(Pl record);
}
