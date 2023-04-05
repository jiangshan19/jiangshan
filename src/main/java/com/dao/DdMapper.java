package com.dao;

import com.pojo.Dd;
import com.pojo.DdExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DdMapper {
    int countByExample(DdExample example);

    int deleteByExample(DdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dd record);

    int insertSelective(Dd record);

    List<Dd> selectByExample(DdExample example);

    Dd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dd record, @Param("example") DdExample example);

    int updateByExample(@Param("record") Dd record, @Param("example") DdExample example);

    int updateByPrimaryKeySelective(Dd record);

    int updateByPrimaryKey(Dd record);
}