package temp.entity;

import java.util.Date;

public class Member {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.id
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.create_date
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.modify_date
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	private Date modifyDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column member.email
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	private String email;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.id
	 * @return  the value of member.id
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.id
	 * @param id  the value for member.id
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.create_date
	 * @return  the value of member.create_date
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.create_date
	 * @param createDate  the value for member.create_date
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.modify_date
	 * @return  the value of member.modify_date
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.modify_date
	 * @param modifyDate  the value for member.modify_date
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column member.email
	 * @return  the value of member.email
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column member.email
	 * @param email  the value for member.email
	 * @mbggenerated  Wed Aug 05 22:48:43 CST 2015
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}
}