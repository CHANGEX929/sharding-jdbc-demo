package com.shardingsphere.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shardingsphere.demo.mapper.TpMemberMapper;
import com.shardingsphere.demo.pojo.TpMember;
import com.shardingsphere.demo.service.TpMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xie Chenxi
 * @date 2018-12-25 12:23
 */
@Service
public class TpMemberServiceImpl extends ServiceImpl<TpMemberMapper, TpMember> implements TpMemberService {

    @Override
    public List<TpMember> listByName(String userName) {

        TpMember tpMember = new TpMember();
        tpMember.setUserName(userName);
        return super.baseMapper.selectList(Wrappers.query(tpMember));
    }
}
