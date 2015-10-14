package com.example.jdbc.mappers;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.BatchSqlUpdate;

import java.sql.Types;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
public class InsertContactDetails  extends BatchSqlUpdate{

    private static final String insertQuery="Insert into CONTACT_TEL_DETAIL values (:ID,:CONTACT_ID,:MOBILE,:HOME) ";

    public InsertContactDetails(DataSource dataSource) {


        super(dataSource,insertQuery);
        declareParameter(new SqlParameter("ID", Types.INTEGER));
        declareParameter(new SqlParameter("CONTACT_ID", Types.INTEGER));
        declareParameter(new SqlParameter("MOBILE", Types.INTEGER));
        declareParameter(new SqlParameter("HOME", Types.INTEGER));
        setBatchSize(20);
    }
}
