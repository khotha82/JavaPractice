package com.example.validators.spring.jsr;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
public enum CustomerType {

    INDIVIDUAL("I"),CORPORATE("R");

    private String code;

    CustomerType(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return code;
    }
}
