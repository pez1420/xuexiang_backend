package com.leebbs;

import java.io.Serializable;

/**
 * 认证就是验证用户身份的过程。在认证过程中，用户需要提交实体信息(Principals)和
 * 凭据信息(Credentials)以检验用户是否合法。最常见的“实体/凭证”组合便是“用户名/密码”组合
 * 
 * @author Administrator
 *
 */
public class Principal implements Serializable {
	private static final long serialVersionUID = -5419021486462590880L;
	
	private String id;
	private String username;

	public Principal(String id, String username) {
		this.id = id;
		this.username = username;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String toString() {
		return this.username;
	}
}
