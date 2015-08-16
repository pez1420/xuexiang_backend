package com.leebbs.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leebbs.admin.entity.Member;
import com.leebbs.admin.service.impl.BaseServiceImpl;
import com.leebbs.admin.service.MemberService;
import com.leebbs.admin.dao.MemberDao;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-15
 */
@Service
public class MemberServiceImpl extends BaseServiceImpl<Member, String> implements MemberService{

    @Resource
    private MemberDao memberDao;

    @Resource
    public void setBaseDao(MemberDao memberDao){
        super.setBaseDao(memberDao);
    }

}