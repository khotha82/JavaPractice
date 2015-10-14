package com.example.aop.annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
@Component("simpleBeanWrapper")
public class SimpleBeanWrapper {

    @Autowired
    private SimpleBean simpleBean;

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public void setSimpleBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }
    public void execute(){

        simpleBean.foo();
    }
}
