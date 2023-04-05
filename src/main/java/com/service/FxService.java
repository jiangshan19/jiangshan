package com.service;

import com.pojo.Fx;

public interface FxService {
    int deleteByPrimaryKey(Integer id);

    int insert(Fx record);

    int insertSelective(Fx record);

    Fx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fx record);

    int updateByPrimaryKeyWithBLOBs(Fx record);

    int updateByPrimaryKey(Fx record);
}
