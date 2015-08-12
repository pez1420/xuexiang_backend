package com.leebbs.admin.service;

import com.leebbs.admin.entity.Log;
import com.leebbs.admin.entity.search.SearchLog;
import com.leebbs.core.utils.Page;
import com.leebbs.core.utils.Pageable;


public interface LogService extends BaseService<Log, String> {
	
	public abstract void clear();
	
	public abstract Page<Log> findPage(Pageable pageable, SearchLog searchLog);
	
}
