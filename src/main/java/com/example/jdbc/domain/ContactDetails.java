package com.example.jdbc.domain;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
public class ContactDetails {

	private Integer id;
	private Integer mobile;
	private Integer home;
	private Integer contactId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Integer getHome() {
		return home;
	}

	public void setHome(Integer home) {
		this.home = home;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
}
