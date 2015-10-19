package com.example.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

import com.example.jdbc.domain.Contact;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */

public class MapRow extends MappingSqlQuery<Contact> {

	private static String GET_CONTACT_DETAILS = "SELECT ID,FIRST_NAME,LAST_NAME,BIRTH_DATE FROM CONTACT";

	public MapRow(DataSource ds) {
		super(ds, GET_CONTACT_DETAILS);
	}

	@Override
	protected Contact mapRow(ResultSet resultSet, int i) throws SQLException {

		Contact contact = new Contact();
		contact.setBirthDate(resultSet.getDate("BIRTH_DATE"));
		contact.setFirstName(resultSet.getString("FIRST_NAME"));
		contact.setLastName(resultSet.getString("LAST_NAME"));
		contact.setId(resultSet.getInt("ID"));
		return contact;
	}
}
