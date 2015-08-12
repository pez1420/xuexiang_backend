package com.leebbs.core.listener;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.leebbs.core.entity.BaseEntity;


public class EntityListener
{
	@PrePersist
	public void prePersist(BaseEntity entity)
	{
		entity.setCreateDate(new Date());
		entity.setModifyDate(new Date());
	}
  
	@PreUpdate
	public void preUpdate(BaseEntity entity)
	{
		entity.setModifyDate(new Date());
	}
}
