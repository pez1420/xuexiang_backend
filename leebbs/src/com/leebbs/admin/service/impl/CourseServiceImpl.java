package com.leebbs.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leebbs.admin.entity.Course;
import com.leebbs.admin.service.impl.BaseServiceImpl;
import com.leebbs.admin.service.CourseService;
import com.leebbs.admin.dao.CourseDao;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-12
 */
@Service
public class CourseServiceImpl extends BaseServiceImpl<Course, String> implements CourseService{

    @Resource
    private CourseDao courseDao;

    @Resource
    public void setBaseDao(CourseDao courseDao){
        super.setBaseDao(courseDao);
    }

}