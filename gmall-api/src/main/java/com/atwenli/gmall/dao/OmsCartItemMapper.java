package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.OmsCartItem;

public interface OmsCartItemMapper  {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCartItem record);

    int updateByPrimaryKey(OmsCartItem record);
}