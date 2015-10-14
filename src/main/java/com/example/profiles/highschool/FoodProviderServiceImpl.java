package com.example.profiles.highschool;

import com.example.profiles.Food;
import com.example.profiles.FoodProviderService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class FoodProviderServiceImpl implements FoodProviderService{


    @Override
    public List<Food> getLunch() {
        return Arrays.asList(new Food("Egg"), new Food("Sandwich"));
    }
}
