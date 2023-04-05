package com.service.impl;

import com.dao.JdMapper;
import com.pojo.Jd;
import com.service.JdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdServiceImpl implements JdService {
    @Autowired
    private JdMapper jdMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jdMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Jd record) {
        return 0;
    }

    @Override
    public int insertSelective(Jd record) {
        return jdMapper.insertSelective(record);
    }

    @Override
    public Jd selectByPrimaryKey(Integer id) {
        return jdMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Jd record) {
        return jdMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Jd record) {
        return 0;
    }
}
