package com.service;
/**
 * 收藏接口
 */
import com.pojo.Sc;
import com.pojo.ScExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScService {
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
