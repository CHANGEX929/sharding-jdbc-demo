package com.shardingsphere.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.shardingsphere.demo.DemoApplicationTests;
import com.shardingsphere.demo.pojo.TpMember;
import com.shardingsphere.demo.service.TpMemberService;
import com.shardingsphere.demo.utils.KeyGenerator;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


public class TpMemberServiceImplTest extends DemoApplicationTests {

    @Resource
    private TpMemberService tpMemberService;

    @Test
    public void insert() {

        KeyGenerator generator = new KeyGenerator();
        for (int i = 0; i < 100; i++) {
            TpMember tpMember = new TpMember();
            tpMember.setCityId(generator.generateKey().longValue());
            tpMember.setUserName(i + "");
            tpMemberService.save(tpMember);
        }
    }

    @Test
    public void listAll() {
        List<TpMember> memberList = tpMemberService.list();
        System.out.println(JSON.toJSONString(memberList));
        System.out.println(memberList.size());
    }

    @Test
    public void listByUserName(){
        List<TpMember> memberList = tpMemberService.listByName("12");
        System.out.println(JSON.toJSONString(memberList));
        System.out.println(memberList.size());
    }
}