package com.dao;

import com.pojo.Wl;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wl record);

    int insertSelective(Wl record);

    Wl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wl record);

    int updateByPrimaryKey(Wl record);
}
