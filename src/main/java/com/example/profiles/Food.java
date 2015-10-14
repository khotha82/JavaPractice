package com.example.profiles;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class Food {

    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }
}
