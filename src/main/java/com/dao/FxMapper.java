package com.dao;

import com.pojo.Fx;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fx record);

    int insertSelective(Fx record);

    Fx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fx record);

    int updateByPrimaryKeyWithBLOBs(Fx record);

    int updateByPrimaryKey(Fx record);
}
