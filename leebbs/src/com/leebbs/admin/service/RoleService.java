package com.leebbs.admin.service;

import java.util.List;

import com.leebbs.admin.entity.Role;
import com.leebbs.admin.entity.search.SearchRole;
import com.leebbs.core.utils.Page;
import com.leebbs.core.utils.Pageable;

public interface RoleService extends BaseService<Role, String>{
	
	public List<Role> findAll();
	
	public void update(Role role, String... authorities);
	
	public abstract Page<Role> findPage(Pageable pageable, SearchRole searchRole);
	
	public void save(Role role, String... authorities);
	
	public  List<Role> findRolesByIds(String[] ids);
}
