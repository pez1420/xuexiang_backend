package com.leebbs.admin.entity;

import com.leebbs.core.ananotation.EntityInfo;
import com.leebbs.core.entity.BaseEntity;

@EntityInfo("专业")
public class Major extends BaseEntity{
	private static final long serialVersionUID = 2332620470744246184L;
    
	private String description;

    private Boolean status;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
    
}
