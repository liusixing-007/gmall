package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PmsBaseAttrValue;

public interface PmsBaseAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);
}