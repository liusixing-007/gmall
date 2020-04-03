package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.OmsOrder;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);
}