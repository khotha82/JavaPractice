package com.example.effjava.spf;

/**
 * Created by krishna_hotha on 6/22/15 2015.
 */
public class TravelClient {


    public static void main(String[] args) {

        TravelService travelServices=TravelServices.newInstance("train");
        System.out.println(travelServices.getVehical());
    }
}
