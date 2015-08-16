package com.leebbs.admin.entity;

import com.leebbs.core.entity.BaseEntity;

public class Country extends BaseEntity{
	private static final long serialVersionUID = -113360287879408110L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
