package com.atwenli.gmall.user.dao;

import com.atwenli.gmall.user.bean.UmsMemberLevel;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UmsMemberLevelMapper extends Mapper<UmsMemberLevel> {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}