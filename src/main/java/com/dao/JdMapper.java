package com.dao;

import com.pojo.Jd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jd record);

    int insertSelective(Jd record);

    Jd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jd record);

    int updateByPrimaryKey(Jd record);
}
