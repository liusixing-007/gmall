package com.atwenli.gmall.user.dao;

import com.atwenli.gmall.user.bean.UmsMemberLevel;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface UmsMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}