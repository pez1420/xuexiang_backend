package com.leebbs.core.entity;

import java.util.Date;

public class BaseEntity extends EntityImpl {
	private static final long serialVersionUID = -4408527936946073327L;

	private Date createDate;
	private Date modifyDate;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}


}
