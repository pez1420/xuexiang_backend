package com.leebbs.admin.service;

import com.leebbs.admin.service.BaseService;
import com.leebbs.admin.entity.Country;
import com.leebbs.admin.entity.search.SearchCountry;
import com.leebbs.core.utils.Page;
import com.leebbs.core.utils.Pageable;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-11
 */
public interface CountryService extends BaseService<Country, String>{
	
	public abstract Page<Country> findPage(Pageable pageable, SearchCountry searchCountry);
}