package com.atwenli.gmall.user.dao;

import com.atwenli.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface UmsMemberMapper extends Mapper<UmsMember> {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    List<UmsMember> selectAllUser();

}