package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PmsSkuInfo;

public interface PmsSkuInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuInfo record);

    int insertSelective(PmsSkuInfo record);

    PmsSkuInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuInfo record);

    int updateByPrimaryKey(PmsSkuInfo record);
}