package com.example.designs.builder;

/**
 * Created by krishna_hotha on 4/29/15 2015.
 */
public class StartBucks {

    private String drink;
    private String size;
    private String sugar;
    private String milk;

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSugar() {

         return  sugar;
    }

    @Override
    public String toString() {

        return drink+" "+size+" "+getSugar()+getMilk();
    }
}
