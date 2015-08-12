package com.leebbs.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leebbs.admin.dao.LogDao;
import com.leebbs.admin.entity.Log;
import com.leebbs.admin.entity.search.SearchLog;
import com.leebbs.admin.service.LogService;
import com.leebbs.core.utils.Page;
import com.leebbs.core.utils.Pageable;



@Service
public class LogServiceImpl extends BaseServiceImpl<Log, String>  
	implements LogService{
	
	@Resource
	private LogDao logDao;
		  
	@Resource
	public void setBaseDao(LogDao logDao) {
		super.setBaseDao(logDao);
	}
	
	@Transactional
	public void clear() {
		this.logDao.removeAll();
	}

	@Transactional(readOnly=true)
	public Page<Log> findPage(Pageable pageable, SearchLog searchLog) {
		//分页并计算出总页数 
		List<Log> logs = logDao.findPage(pageable, searchLog);
		Page<Log> page = new Page<Log>(logs, pageable);
		return page;
	}
}
