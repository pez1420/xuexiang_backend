package com.leebbs.admin.service;

import java.util.List;

import com.leebbs.LogConfig;



public interface LogConfigService {
	/**
	 * 从system.xml读取需要数据库记录日志的url配置
	 * @return 日志配置列表
	 */
	public abstract List<LogConfig> getAll();
}
