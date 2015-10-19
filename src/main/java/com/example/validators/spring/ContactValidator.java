package com.example.validators.spring;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.propertyeditor.properties.Contact;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
@Component("contactValidator")
public class ContactValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return aClass.equals(Contact.class);
	}

	@Override
	public void validate(Object o, Errors errors) {

		Contact contact = (Contact) o;
		ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty");
	}
}
