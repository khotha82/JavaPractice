package com.example.h2database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbc.domain.Contact;

/**
 * Created by krishna_hotha on 5/14/15 2015.
 */
@Repository("contactDAOH2")
public class ContactDAOH2 {

	private static String GET_CONTACT_BY_ID = "SELECT ID,FIRST_NAME,LAST_NAME,BIRTH_DATE FROM CONTACT WHERE ID=?";
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {

		ApplicationContext applicationContext = new GenericXmlApplicationContext("spring-memory.jdbc.xml");
		ContactDAOH2 contactDAOH2 = (ContactDAOH2) applicationContext.getBean("contactDAOH2");
		Contact c = contactDAOH2.getContactById(1);
		System.out.println(c);
	}

	public Contact getContactById(Integer id) {

		return jdbcTemplate.queryForObject(GET_CONTACT_BY_ID, new Object[] { id }, ((resultSet, i) -> {

			Contact contact = new Contact();
			contact.setBirthDate(resultSet.getDate("BIRTH_DATE"));
			contact.setFirstName(resultSet.getString("FIRST_NAME"));
			contact.setLastName(resultSet.getString("LAST_NAME"));
			contact.setId(resultSet.getInt("ID"));
			return contact;
		}));

	}
}
