package com.example.validators.spring.jsr.custom;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = CustomerValidator.class)
@Documented
public @interface CustomValidatorAnnotation {

	String message() default "some rror";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
