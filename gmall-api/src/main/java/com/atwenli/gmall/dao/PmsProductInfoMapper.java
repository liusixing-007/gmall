package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PmsProductInfo;

public interface PmsProductInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductInfo record);

    int insertSelective(PmsProductInfo record);

    PmsProductInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductInfo record);

    int updateByPrimaryKey(PmsProductInfo record);
}