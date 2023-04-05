package com.service.impl;

import com.dao.WlMapper;
import com.pojo.Wl;
import com.service.WlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WlServiceImpl implements WlService {
    @Autowired
    private WlMapper wlMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return wlMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Wl record) {
        return 0;
    }

    @Override
    public int insertSelective(Wl record) {
        return wlMapper.insertSelective(record);
    }

    @Override
    public Wl selectByPrimaryKey(Integer id) {
        return wlMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Wl record) {
        return wlMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Wl record) {
        return 0;
    }
}
