package com.example.propertyeditor.convertors;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.core.convert.converter.Converter;

import javax.annotation.PostConstruct;

/**
 * Created by krishna_hotha on 5/6/15 2015.
 */
public class StringToDateConvertor implements Converter<String,DateTime> {

    private DateTimeFormatter dateTimeFormatter;
    private String dateFormat ="yyyy-MM-dddd";

    @PostConstruct
    public void setDateTimeFormatter(){

        dateTimeFormatter= DateTimeFormat.forPattern(dateFormat);
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public DateTime convert(String s) {
        return DateTime.parse(s,dateTimeFormatter);
    }
}
