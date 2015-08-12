package com.leebbs.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leebbs.admin.entity.Admin;
import com.leebbs.admin.entity.search.SearchAdmin;
import com.leebbs.core.utils.Page;
import com.leebbs.core.utils.Pageable;



public abstract interface AdminService extends BaseService<Admin, String> {
	
	public abstract boolean usernameExists(String username); 

	public abstract Admin findByUsername(String username);
	
	public abstract Page<Admin> findPage(Pageable pageable, SearchAdmin searchAdmin);
	
	public abstract List<String> findAuthorities(String id);
	
	public abstract boolean isAuthenticated();

	public abstract Admin getCurrent();

	public abstract String getCurrentUsername();
	
	public abstract void updateWithRole(Admin admin); 
	
	public abstract Admin findAdminRoles(String id);	
}

