package com.example.validators.spring;

import com.example.propertyeditor.properties.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.ValidationUtils;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
public class ValidatorTest {


    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-svalidation.xml");

       ContactValidator contactValidator=(ContactValidator)context.getBean("contactValidator");
        Contact c=new Contact();
        c.setFirstName(null);
        c.setLastName("hotha");
        BindingResult bindingResult=new BeanPropertyBindingResult(c,"chris");
        ValidationUtils.invokeValidator(contactValidator,c,bindingResult);
        for(ObjectError error:bindingResult.getAllErrors()){
            System.out.println(error);
        }
    }
}
