package com.example.jdbc.mappers;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlFunction;

import java.math.BigDecimal;
import java.sql.Types;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
public class SQLFunctionMapper extends SqlFunction<BigDecimal> {

	private static final String query = "SELECT COMBINE(?,?) FROM DUAL";

	public SQLFunctionMapper(DataSource dataSource) {

        super(dataSource,query);
        declareParameter(new SqlParameter(Types.INTEGER));
        declareParameter(new SqlParameter(Types.INTEGER));
        compile();
	}
}
