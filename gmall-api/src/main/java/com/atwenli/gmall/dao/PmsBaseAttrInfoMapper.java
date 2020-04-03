package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PmsBaseAttrInfo;

public interface PmsBaseAttrInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrInfo record);

    int insertSelective(PmsBaseAttrInfo record);

    PmsBaseAttrInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBaseAttrInfo record);

    int updateByPrimaryKey(PmsBaseAttrInfo record);
}