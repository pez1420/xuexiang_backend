package com.leebbs.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leebbs.admin.entity.Country;
import com.leebbs.admin.service.impl.BaseServiceImpl;
import com.leebbs.admin.service.CountryService;
import com.leebbs.admin.dao.CountryDao;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-11
 */
@Service
public class CountryServiceImpl extends BaseServiceImpl<Country, String> implements CountryService{

    @Resource
    private CountryDao countryDao;

    @Resource
    public void setBaseDao(CountryDao countryDao){
        super.setBaseDao(countryDao);
    }

}