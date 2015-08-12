package com.leebbs.core.entity;

import java.io.Serializable;

public interface Entity extends Serializable{
	
	void setId(String id);
	
	String getId();
}

