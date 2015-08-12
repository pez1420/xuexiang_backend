package com.leebbs.admin.service.impl;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import com.leebbs.admin.service.BaseService;
import com.leebbs.core.dao.BaseDao;


/**
 * 默认情况下，只有来自外部的方法调用才会被AOP代理捕获，
 * 也就是，类内部方法调用本类内部的其他方法并不会引起事务行为，
 * 即使被调用方法使用@Transactional注解进行修饰
 * 
 * 在service类前加上@Transactional，声明这个service所有方法需要事务管理。每一个业务方法开始时都会打开一个事务。
	Spring默认情况下会对运行期例外(RunTimeException)进行事务回滚。这个例外是unchecked
	如果遇到checked意外就不回滚。
	如何改变默认规则：
	1 让checked例外也回滚：在整个方法前加上 @Transactional(rollbackFor=Exception.class)
	2 让unchecked例外不回滚： @Transactional(notRollbackFor=RunTimeException.class)
	3 不需要事务管理的(只查询的)方法：@Transactional(propagation=Propagation.NOT_SUPPORTED)
 * @author lyb
 *
 * @param <T>
 * @param <ID>
 */


public class BaseServiceImpl<T, ID extends Serializable> implements
	BaseService<T, ID> {

	private BaseDao<T, ID> baseDao;

	public void setBaseDao(BaseDao<T, ID> baseDao) {
		this.baseDao = baseDao;
	}
	
	@Transactional
	public void save(T entity) {
		this.baseDao.save(entity);
		
	}

	@Transactional
	public void update(T entity) {
		this.baseDao.update(entity);
	}

	@Transactional(readOnly = true)
	public T find(ID id) {
		return this.baseDao.find(id);
	}

	@Transactional
	public void remove(ID id) {
		this.baseDao.remove(id);
	}

	@Transactional
	public void remove(ID... ids) {
		if (ids != null) {
			for (ID id : ids) {
				remove(id);
			}
		}
	}

	@Transactional(readOnly = true)
	public long count() {
		return baseDao.count();
	}

}
