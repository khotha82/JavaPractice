package com.example.validators.spring.jsr;

import com.example.validators.spring.jsr.custom.CustomValidatorAnnotation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
@CustomValidatorAnnotation
public class Customer {

	@NotNull
	@Size(min = 10, max = 60)
	private String firstName;
	private String lastName;

	@NotNull
	private CustomerType customerType;

	private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}