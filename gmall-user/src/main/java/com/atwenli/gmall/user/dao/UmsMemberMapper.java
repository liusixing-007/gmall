package com.atwenli.gmall.user.dao;

import com.atwenli.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    List<UmsMember> selectAllUser();

}