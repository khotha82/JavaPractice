package com.example.designs.builder;

/**
 * Created by krishna_hotha on 4/29/15 2015.
 */
public abstract class StarBuckBuilder {

    protected StartBucks startBucks;

    public StartBucks getStartBucks() {
        return startBucks;
    }

    public void setStartBucks(StartBucks startBucks) {
        this.startBucks = startBucks;
    }



    protected  abstract void  build(DrinkPreference preference);




}
