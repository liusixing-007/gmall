package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PmsBaseCatalog2;

public interface PmsBaseCatalog2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog2 record);

    int insertSelective(PmsBaseCatalog2 record);

    PmsBaseCatalog2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PmsBaseCatalog2 record);

    int updateByPrimaryKey(PmsBaseCatalog2 record);
}