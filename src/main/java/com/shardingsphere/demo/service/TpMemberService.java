package com.shardingsphere.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shardingsphere.demo.pojo.TpMember;

import java.util.List;

/**
 * @Author Xie Chenxi
 * @Date 2018/12/25 12:22
 */
public interface TpMemberService extends IService<TpMember> {
    List<TpMember> listByName(String userName);
}
