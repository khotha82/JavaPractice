package com.example.profiles;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class FoodProfileTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-profile.xml");
		FoodProviderService foodProviderService = (FoodProviderService) applicationContext.getBean("lunchService");
		List<Food> foodList = foodProviderService.getLunch();

        for(Food f:foodList){
            System.out.println(f);
        }
    }
}
