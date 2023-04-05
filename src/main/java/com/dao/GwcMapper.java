package com.dao;

import com.pojo.Cp;
import com.pojo.Gwc;
import com.pojo.GwcExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GwcMapper {
    int countByExample(GwcExample example);

    int deleteByExample(GwcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gwc record);

    int insertSelective(Gwc record);

    List<Gwc> selectByExample(GwcExample example);

    Gwc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gwc record, @Param("example") GwcExample example);

    int updateByExample(@Param("record") Gwc record, @Param("example") GwcExample example);

    int updateByPrimaryKeySelective(Gwc record);

    int updateByPrimaryKey(Gwc record);

    String getGwc(Gwc record);

    Cp getQueryData(String id);

    int getKc(String id);
    int upDdbh(Gwc record);
    int upPfpj(Gwc record);
    int hfPfpj(Gwc record);
}