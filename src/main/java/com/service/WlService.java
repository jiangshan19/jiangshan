package com.service;

import com.pojo.Wl;

public interface WlService {
    int deleteByPrimaryKey(Integer id);

    int insert(Wl record);

    int insertSelective(Wl record);

    Wl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wl record);

    int updateByPrimaryKey(Wl record);
}
