package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PaymentInfo;

public interface PaymentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PaymentInfo record);

    int insertSelective(PaymentInfo record);

    PaymentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PaymentInfo record);

    int updateByPrimaryKey(PaymentInfo record);
}