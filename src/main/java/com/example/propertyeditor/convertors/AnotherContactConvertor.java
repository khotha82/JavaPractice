package com.example.propertyeditor.convertors;

import com.example.propertyeditor.properties.Contact;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by krishna_hotha on 5/6/15 2015.
 */
public class AnotherContactConvertor implements Converter<Contact,AnotherContact> {
    @Override
    public AnotherContact convert(Contact contact) {

        AnotherContact anotherContact=new AnotherContact();
        anotherContact.setLastName(contact.getFirstName());
        anotherContact.setFirstName(contact.getLastName());
        anotherContact.setDateTime(contact.getDateTime());
        anotherContact.setUrl(contact.getUrl());
        return anotherContact;
    }
}
