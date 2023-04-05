package com.service.impl;
/**
 * 收藏接口实现类
 */

import com.dao.ScMapper;
import com.pojo.Sc;
import com.pojo.ScExample;
import com.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScServiceImpl implements ScService {
    @Autowired
    private ScMapper scMapper;
    @Override
    public int countByExample(ScExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ScExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Sc record) {
        return scMapper.insert(record);
    }

    @Override
    public int insertSelective(Sc record) {
        return 0;
    }

    @Override
    public List<Sc> selectByExample(ScExample example) {
        return null;
    }

    @Override
    public Sc selectByPrimaryKey(Integer id) {
        return scMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Sc record, ScExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Sc record, ScExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Sc record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Sc record) {
        return 0;
    }

    @Override
    public String getSc(Sc record) {
        return scMapper.getSc(record);
    }
}
