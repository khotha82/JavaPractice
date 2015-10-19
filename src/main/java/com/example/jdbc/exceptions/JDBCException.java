package com.example.jdbc.exceptions;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;

/**
 * Created by krishna_hotha on 5/1/15 2015.
 */
public class JDBCException extends SQLErrorCodeSQLExceptionTranslator {

	@Override
	public DataAccessException translate(String task, String sql, SQLException ex) {

		System.out.println(task);
		System.out.println(sql);
		System.out.println(ex);
		return super.translate(task, sql, ex);
	}
}
