package com.atwenli.gmall.dao;

import com.atwenli.gmall.bean.PmsCommentReplay;

public interface PmsCommentReplayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    int insertSelective(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCommentReplay record);

    int updateByPrimaryKey(PmsCommentReplay record);
}