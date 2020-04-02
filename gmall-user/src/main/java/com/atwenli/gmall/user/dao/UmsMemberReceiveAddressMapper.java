package com.atwenli.gmall.user.dao;

import com.atwenli.gmall.user.bean.UmsMemberReceiveAddress;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}