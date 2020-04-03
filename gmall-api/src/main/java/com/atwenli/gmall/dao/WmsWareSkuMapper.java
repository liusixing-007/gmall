package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.WmsWareSku;

public interface WmsWareSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareSku record);

    int insertSelective(WmsWareSku record);

    WmsWareSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsWareSku record);

    int updateByPrimaryKey(WmsWareSku record);
}