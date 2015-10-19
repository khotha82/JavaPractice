package com.example.jdbc.mappers;

import javax.sql.DataSource;

import oracle.jdbc.OracleTypes;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
public class StoredProcedureMapper extends StoredProcedure {

	private static final String storedProcedure = "ADD_NUMBERS";

	public StoredProcedureMapper(DataSource dataSource) {

		super(dataSource, storedProcedure);
		declareParameter(new SqlParameter("A", OracleTypes.NUMBER));
		declareParameter(new SqlParameter("B", OracleTypes.NUMBER));
		declareParameter(new SqlOutParameter("TOTAL", OracleTypes.NUMBER));

	}

}
