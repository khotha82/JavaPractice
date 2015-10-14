package com.example.validators.spring.jsr;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
public enum Gender {

    MALE("M"),FEMALE("F");
    private String type;

    Gender(String type) {
        this.type = type;
    }


    @Override
    public String toString() {

        return type;
    }
}
