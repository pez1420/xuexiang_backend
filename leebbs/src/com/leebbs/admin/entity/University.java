package com.leebbs.admin.entity;

import com.leebbs.core.entity.BaseEntity;

public class University extends BaseEntity{
	private static final long serialVersionUID = -6363797921991152332L;
	
    private String name;

    private String description;

    private Country country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
    
    
}
