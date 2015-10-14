package com.example.methodInjection;

/**
 * Created by krishna_hotha on 4/10/15.
 */
public abstract class AbstractBean implements DemoBean {

    @Override
    public abstract HelperBean getHelperBean();

    @Override
    public void doSomeThing() {
        getHelperBean().doSomethingUseful();
    }
}
