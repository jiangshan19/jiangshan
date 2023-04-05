package com.service.impl;

import com.dao.FxMapper;
import com.pojo.Fx;
import com.service.FxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FxServiceImpl implements FxService {
    @Autowired
    private FxMapper fxMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return fxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Fx record) {
        return 0;
    }

    @Override
    public int insertSelective(Fx record) {
        return fxMapper.insertSelective(record);
    }

    @Override
    public Fx selectByPrimaryKey(Integer id) {
        return fxMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Fx record) {
        return fxMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Fx record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Fx record) {
        return 0;
    }
}
