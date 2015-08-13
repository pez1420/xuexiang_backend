package com.leebbs.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leebbs.admin.entity.University;
import com.leebbs.admin.service.impl.BaseServiceImpl;
import com.leebbs.admin.service.UniversityService;
import com.leebbs.admin.dao.UniversityDao;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-12
 */
@Service
public class UniversityServiceImpl extends BaseServiceImpl<University, String> implements UniversityService{

    @Resource
    private UniversityDao universityDao;

    @Resource
    public void setBaseDao(UniversityDao universityDao){
        super.setBaseDao(universityDao);
    }

}