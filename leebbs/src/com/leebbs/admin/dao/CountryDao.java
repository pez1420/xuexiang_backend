package com.leebbs.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leebbs.core.dao.BaseDao;
import com.leebbs.core.utils.Pageable;
import com.leebbs.admin.entity.Country;
import com.leebbs.admin.entity.search.SearchCountry;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-15
 */
public interface CountryDao extends BaseDao <Country, String> {
	/**
	 * 按分页条件和查询参数对返回结果进行分页
	 * 
	 * @param pageable 前端分页数据
	 * @param searchAdminer 搜索条件 
	 * @return
	 */
	public abstract List<Country> findPage(@Param("pageable")Pageable pageable, 
			@Param("search")SearchCountry searchCountry);
}