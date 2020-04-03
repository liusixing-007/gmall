package com.atwenli.gmall.user.service;

import com.atwenli.gmall.bean.UmsMember;
import com.atwenli.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @title:
 * @description:
 * @author: Asing
 * @date: 2020-03-30 15:49:10
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getAllUserAddressByMemberId(Long memberId);
}
