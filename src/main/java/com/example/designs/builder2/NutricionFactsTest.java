package com.example.designs.builder2;

/**
 * Created by krishna_hotha on 5/8/15 2015.
 */
public class NutricionFactsTest {


    public static void main(String[] args) {

        NutricionFacts nutricionFacts=new NutricionFacts.Builder(10,20).setCalories(10).setCarboHydrate(20).setSodium(100).build();
        System.out.println(nutricionFacts);
    }
}
