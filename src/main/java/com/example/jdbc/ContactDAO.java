package com.example.jdbc;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jdbc.domain.Contact;
import com.example.jdbc.mappers.InsertContactDetails;
import com.example.jdbc.mappers.MapRow;
import com.example.jdbc.mappers.SQLFunctionMapper;
import com.example.jdbc.mappers.StoredProcedureMapper;

/**
 * Created by krishna_hotha on 5/1/15 2015.
 */
@Service("contactDAO")
public class ContactDAO {

	private static String GET_CONTACT_BY_ID = "SELECT ID,FIRST_NAME,LAST_NAME,BIRTH_DATE FROM CONTACT WHERE ID=?";
	private static String INSERT_CONTACT = "INSERT INTO CONTACT VALUES(:ID,:FIRST_NAME,:LAST_NAME,:BIRTH_DATE)";
	private ContactDAO contactDAO;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private MapRow mapRow;
	private InsertContactDetails insertContactDetails;
	private SQLFunctionMapper sqlFunctionMapper;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		ContactDAO dao = (ContactDAO) context.getBean("contactDAO");

		dao.setContactDAO(dao);
		// dao.getListContacts().stream().forEach(contact -> {
		//
		// System.out.println(contact);
		// });

		// System.out.println(dao.sum());
		// dao.result();
		dao.insertContact(300);
		System.out.println("Done Calling this ddddeeee");

	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		mapRow = new MapRow(jdbcTemplate.getDataSource());
		sqlFunctionMapper = new SQLFunctionMapper(jdbcTemplate.getDataSource());

	}

	public List<Contact> getListContacts() {

		return mapRow.execute();
	}

	@Transactional()
	public void insertContact(int i) {

		System.out.println("Entering in normal method");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Map<String,Object>paramsMap=new HashMap<>();
		// paramsMap.put("ID",i);
		// paramsMap.put("FIRST_NAME","KRISHNA");
		// paramsMap.put("LAST_NAME","HOTHA"+i);
		// paramsMap.put("BIRTH_DATE",new Date());
		//
		// getNamedParameterJdbcTemplate().update(INSERT_CONTACT, paramsMap);
		//
		System.out.println("ending insert contact method");
		contactDAO.insertContactDetails();
		System.out.println("done done tttt");

	}

	@Transactional
	@Async
	public void insertContactDetails() {

		System.out.println("insert contact details starting");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("insert contact details done");

		// insertContactDetails=new InsertContactDetails(getJdbcTemplate().getDataSource());
		//
		// int k=5;
		// for(int i=30;i<60;i++){
		//
		// Map<String,Integer> params=new HashMap<String,Integer>();
		//
		// params.put("ID",k++);
		// params.put("CONTACT_ID",1);
		// params.put("MOBILE",123*i);
		// params.put("HOME",456*i);
		// insertContactDetails.updateByNamedParam(params);
		// }
		// insertContactDetails.flush();
		// System.out.println("insert contact details Ending");
	}

	public Contact getContactById(Integer id) {

		return getJdbcTemplate().queryForObject(GET_CONTACT_BY_ID, new Object[] { id }, ((resultSet, i) -> {

			Contact contact = new Contact();
			contact.setBirthDate(resultSet.getDate("BIRTH_DATE"));
			contact.setFirstName(resultSet.getString("FIRST_NAME"));
			contact.setLastName(resultSet.getString("LAST_NAME"));
			contact.setId(resultSet.getInt("ID"));
			return contact;
		}));

	}

	public void result() {

		Map<String, Integer> params = new HashMap<>();
		params.put("A", 10);
		params.put("B", 20);

		Map<String, Object> result = new StoredProcedureMapper(getJdbcTemplate().getDataSource()).execute(params);
		System.out.println(result.get("TOTAL"));
	}

	public BigDecimal sum() {

		return sqlFunctionMapper.execute(10, 20).get(0);
	}

	public ContactDAO getContactDAO() {
		return contactDAO;
	}

	public void setContactDAO(ContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}
}
