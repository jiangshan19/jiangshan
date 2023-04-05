package com.service.impl;

import com.dao.DdMapper;
import com.pojo.Dd;
import com.pojo.DdExample;
import com.service.DdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DdServiceImpl implements DdService {
    @Autowired
    private DdMapper ddMapper;
    @Override
    public int countByExample(DdExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(DdExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ddMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Dd record) {
        return ddMapper.insert(record);
    }

    @Override
    public int insertSelective(Dd record) {
        return ddMapper.insertSelective(record);
    }

    @Override
    public List<Dd> selectByExample(DdExample example) {
        return null;
    }

    @Override
    public Dd selectByPrimaryKey(Integer id) {
        return ddMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Dd record, DdExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Dd record, DdExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Dd record) {
        return ddMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dd record) {
        return ddMapper.updateByPrimaryKey(record);
    }

}
