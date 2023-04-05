package com.service;

import com.pojo.Jd;

public interface JdService {
    int deleteByPrimaryKey(Integer id);

    int insert(Jd record);

    int insertSelective(Jd record);

    Jd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jd record);

    int updateByPrimaryKey(Jd record);
}
