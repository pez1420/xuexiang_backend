package com.leebbs.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leebbs.admin.entity.Major;
import com.leebbs.admin.service.impl.BaseServiceImpl;
import com.leebbs.admin.service.MajorService;
import com.leebbs.admin.dao.MajorDao;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-12
 */
@Service
public class MajorServiceImpl extends BaseServiceImpl<Major, String> implements MajorService{

    @Resource
    private MajorDao majorDao;

    @Resource
    public void setBaseDao(MajorDao majorDao){
        super.setBaseDao(majorDao);
    }

}