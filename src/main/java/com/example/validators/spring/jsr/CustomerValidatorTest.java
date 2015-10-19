package com.example.validators.spring.jsr;

import java.util.Set;

import javax.validation.ConstraintViolation;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
public class CustomerValidatorTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setLastName("hotha");
		customer.setFirstName(null);
		customer.setCustomerType(null);
		customer.setLastName(null);

		CustomerValidator customerValidator = new CustomerValidator();
		Set<ConstraintViolation<Customer>> violations = customerValidator.validateCustomer(customer);
		for (ConstraintViolation<Customer> violation : violations) {
			System.out.println("Validation error for property: " +
					violation.getPropertyPath()
					+ " with value: " + violation.getInvalidValue()
					+ " with error message: " + violation.getMessage());
		}
	}
}
