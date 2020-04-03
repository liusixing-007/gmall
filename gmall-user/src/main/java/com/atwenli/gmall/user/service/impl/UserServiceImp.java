package com.atwenli.gmall.user.service.impl;
import com.atwenli.gmall.bean.UmsMember;
import com.atwenli.gmall.bean.UmsMemberReceiveAddress;
import com.atwenli.gmall.dao.UmsMemberLevelMapper;
import com.atwenli.gmall.dao.UmsMemberMapper;
import com.atwenli.gmall.dao.UmsMemberReceiveAddressMapper;
import com.atwenli.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
        List<UmsMember> umsMembers=umsMemberMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAllUserAddressByMemberId(Long memberId) {

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

/**
 * 与如下效果相同
 */
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
