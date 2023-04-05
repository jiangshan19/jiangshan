package com.service.impl;
/**
 * 购物车接口实现类
 */

import com.dao.GwcMapper;
import com.pojo.Cp;
import com.pojo.Gwc;
import com.pojo.GwcExample;
import com.service.GwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GwcServiceImpl implements GwcService {
    @Autowired
    private GwcMapper gwcMapper;
    @Override
    public int countByExample(GwcExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(GwcExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gwcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Gwc record) {
        return gwcMapper.insert(record);
    }

    @Override
    public int insertSelective(Gwc record) {
        return gwcMapper.insertSelective(record);
    }

    @Override
    public List<Gwc> selectByExample(GwcExample example) {
        return null;
    }

    @Override
    public Gwc selectByPrimaryKey(Integer id) {
        return gwcMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Gwc record, GwcExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Gwc record, GwcExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Gwc record) {
        return gwcMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Gwc record) {
        return gwcMapper.updateByPrimaryKey(record);
    }

    @Override
    public String getGwc(Gwc record) {
        return gwcMapper.getGwc(record);
    }

    @Override
    public Cp getQueryData(String id) {//根据id查询详细内容
        return gwcMapper.getQueryData(id);
    }

    @Override
    public int getKc(String id) {
        return gwcMapper.getKc(id);
    }

    @Override
    public int upDdbh(Gwc record) {
        return gwcMapper.upDdbh(record);
    }

    @Override
    public int upPfpj(Gwc record) {
        return gwcMapper.upPfpj(record);
    }

    @Override
    public int hfPfpj(Gwc record) {
        return gwcMapper.hfPfpj(record);
    }
}
