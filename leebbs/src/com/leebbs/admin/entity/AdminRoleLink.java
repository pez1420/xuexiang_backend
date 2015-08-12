package com.leebbs.admin.entity;

import java.io.Serializable;
import com.leebbs.core.ananotation.EntityInfo;;

@EntityInfo("用户角色关联表,用于描述Admin和Role之间的对应关系")
public class AdminRoleLink implements Serializable{

	private static final long serialVersionUID = -7345821695179295348L;
	
	private Admin admin;
	
	private Role role;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
