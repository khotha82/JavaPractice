package com.example.validators.spring.jsr;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
public class CustomerValidator {

	private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

	public Set<ConstraintViolation<Customer>> validateCustomer(Customer customer) {

		return validator.validate(customer);

	}
}
