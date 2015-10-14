package com.example.jdbc.domain;

import java.util.Date;

/**
 * Created by krishna_hotha on 5/1/15 2015.
 */
public class Contact {

	private Integer id;
	private String firstName;
	private String lastName;
	private Date birthDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return getId() + " " + getFirstName() + " " + getLastName() + " " + getBirthDate();
	}
}
