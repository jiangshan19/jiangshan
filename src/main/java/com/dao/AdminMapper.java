package com.dao;

import com.pojo.Admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    String getSame(String paperName);

    String upgetSame(Admin record);

    List<Admin> adminLogin(Admin record);

    int adminupdateByUsername(Admin record);

    List<Admin> admincheckPwd(Admin record);

    int adminupPwd(Admin record);
}