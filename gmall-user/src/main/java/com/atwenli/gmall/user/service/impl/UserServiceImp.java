package com.atwenli.gmall.user.service.impl;

import com.atwenli.gmall.user.bean.UmsMember;
import com.atwenli.gmall.user.bean.UmsMemberLevel;
import com.atwenli.gmall.user.bean.UmsMemberReceiveAddress;
import com.atwenli.gmall.user.dao.UmsMemberLevelMapper;
import com.atwenli.gmall.user.dao.UmsMemberMapper;
import com.atwenli.gmall.user.dao.UmsMemberReceiveAddressMapper;
import com.atwenli.gmall.user.dao.UserDao;
import com.atwenli.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title:
 * @description:
 * @author: Asing
 * @date: 2020-03-30 15:49:55
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;
    @Autowired
    private UmsMemberLevelMapper umsMemberLevelMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember>umsMembers=umsMemberMapper.selectAllUser();
        return umsMembers;
    }
}
