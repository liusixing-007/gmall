package com.atwenli.gmall.user.controller;

import com.atwenli.gmall.user.bean.UmsMember;
import com.atwenli.gmall.user.bean.UmsMemberReceiveAddress;
import com.atwenli.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title: 用户服务控制层
 * @description:
 * @author: Asing
 * @date: 2020-03-30 15:46:11
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping(value = "index")
    public String index(){
        return "dddddd";
    }
    @GetMapping(value = "getAllUser")
    public List<UmsMember> getAllUser(){
        List<UmsMember>  umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @GetMapping(value = "index1")
    public String index1(){
        return "dddddd1";
    }


    @GetMapping(value = "getAllUserAddressByMemberId")
    public List<UmsMemberReceiveAddress> getAllUserAddressByMemberId(Long memberId){

        System.out.println(2222);
        System.out.println(333);
        List<UmsMemberReceiveAddress>  umsMemberReceiveAddresses=userService.getAllUserAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }


}
