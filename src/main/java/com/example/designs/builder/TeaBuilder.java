package com.example.designs.builder;

/**
 * Created by krishna_hotha on 4/29/15 2015.
 */
public class TeaBuilder extends StarBuckBuilder {

    @Override
    protected void build(DrinkPreference preference) {

        startBucks = new StartBucks();
        startBucks.setDrink(preference.getDrinkName());

        setSugar(preference.getSugar());
        setMilk(preference.getMilk());
        setSize(preference.getSize());

    }

    private void setSize(String size) {

        startBucks.setSize(size);

    }

    private void setMilk(Boolean milk) {

        if (milk) {
            startBucks.setMilk("with milk");
        }
        else
            startBucks.setMilk("with out milk");
    }

    private void setSugar(Boolean sugar) {

        if (sugar) {
            startBucks.setSugar("with sugar");
        }
        else
            startBucks.setSugar("with out sugar");
    }

}
