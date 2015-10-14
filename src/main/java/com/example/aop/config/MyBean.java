package com.example.aop.config;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 */
public class MyBean {

    private MyDependency dependency;

    public MyDependency getDependency() {
        return dependency;
    }

    public void setDependency(MyDependency dependency) {
        this.dependency = dependency;
    }

    public void execute(){

        dependency.bar();
        dependency.foo();
        dependency.foo(100);
        dependency.foo(101);
        dependency.foo(102);
    }
}
