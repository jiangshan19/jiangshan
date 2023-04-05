package com.service;

import com.pojo.Dd;
import com.pojo.DdExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DdService {
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
