package com.leebbs.admin.tests;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leebbs.admin.entity.Role;
import com.leebbs.admin.service.AdminService;
import com.leebbs.admin.service.RoleService;

public class TestRole {
	protected static RoleService roleService;
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {
		 try {
			 ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml",
					 "applicationContext-mybatis.xml"});
			 roleService = (RoleService)cxt.getBean("roleServiceImpl");
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }	
	
	public void update() {
		Role role = new Role();
		role.setId("a07c4a0719bb11e5bc5474e5432100f2");
		role.setName("超级角色4");
		role.setIsSystem(Boolean.valueOf(true));
		role.setDescription("超级角色4");
		String[] authorities = new String[]{"admin:4", "admin:5", "admin:6"};
		roleService.update(role, authorities);
	}
	
	
	public void save() {
		Role role = new Role();
		role.setName("角色4");
		role.setIsSystem(Boolean.valueOf(true));
		role.setDescription("角色4");
		String auths[] = {"admin:33", "admin:3331"};
		roleService.save(role, auths);
		System.out.print(role.getId());
	}
	
	@Test
	public void findRolesByIds() {
		String ids[] = new String[]{"a07c4a0719bb11e5bc5474e5432100f2","b07c4a0719bb22e5bc5474e5432100f2"};
		List<Role> roles = roleService.findRolesByIds(ids);
		if (roles != null && !roles.isEmpty()) {
			for (Role role : roles) {
				System.out.println(role.getName());
			}
		}
	}
}
