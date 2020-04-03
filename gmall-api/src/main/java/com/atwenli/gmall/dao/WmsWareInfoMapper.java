package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.WmsWareInfo;

public interface WmsWareInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareInfo record);

    int insertSelective(WmsWareInfo record);

    WmsWareInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareInfo record);

    int updateByPrimaryKey(WmsWareInfo record);
}