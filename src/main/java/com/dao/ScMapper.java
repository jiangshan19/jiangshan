package com.dao;
/**
 * 收藏模块mapper 数据操作
 */

import com.pojo.Sc;
import com.pojo.ScExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ScMapper {
    int countByExample(ScExample example);

    int deleteByExample(ScExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScExample example);

    Sc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByExample(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);

    String getSc(Sc record);
}