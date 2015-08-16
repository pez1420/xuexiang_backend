package com.leebbs.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leebbs.admin.entity.Country;
import com.leebbs.admin.entity.search.SearchCountry;
import com.leebbs.admin.service.impl.BaseServiceImpl;
import com.leebbs.admin.service.CountryService;
import com.leebbs.admin.dao.CountryDao;
import com.leebbs.core.utils.Page;
import com.leebbs.core.utils.Pageable;

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

    @Transactional(readOnly = true)
	public Page<Country> findPage(Pageable pageable, SearchCountry searchCountry) {
		List<Country> countrys = countryDao.findPage(pageable, searchCountry);
		Page<Country> page = new Page<Country>(countrys, pageable);
		return page;
	}

}