package com.example.propertyeditor.properties;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;


/**
 * Created by krishna_hotha on 5/6/15 2015.
 */
public class DatePropertyEditorRegistor  implements PropertyEditorRegistrar {

    private DateTimeFormatter dateTimeFormatter;

    DatePropertyEditorRegistor(String dateFormat){

        dateTimeFormatter= DateTimeFormat.forPattern(dateFormat);
    }

    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {

            propertyEditorRegistry.registerCustomEditor(DateTime.class, new DateTimePropertyEdiotor(dateTimeFormatter));
    }


    private static class DateTimePropertyEdiotor extends PropertyEditorSupport {

        private DateTimeFormatter dateTimeFormatter;

        public DateTimePropertyEdiotor(DateTimeFormatter dateTimeFormatter) {
            this.dateTimeFormatter = dateTimeFormatter;
        }

        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            setValue(DateTime.parse(text,dateTimeFormatter));
        }
    }
}
