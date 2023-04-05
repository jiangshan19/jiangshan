package com.service.impl;

import com.dao.PlMapper;
import com.pojo.Pl;
import com.service.PlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlServiceImpl implements PlService {
    @Autowired
    private PlMapper plMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return plMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Pl record) {
        return 0;
    }

    @Override
    public int insertSelective(Pl record) {
        return plMapper.insertSelective(record);
    }

    @Override
    public Pl selectByPrimaryKey(Integer id) {
        return plMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Pl record) {
        return plMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Pl record) {
        return 0;
    }
}
