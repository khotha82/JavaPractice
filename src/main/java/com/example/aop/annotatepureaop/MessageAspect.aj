package com.example.aop.annotatepureaop;

/**
 * Created by krishna_hotha on 4/28/15 2015.
 *
 */
public aspect MessageAspect {

    private String suffix;
    private String prefix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    pointcut doWriting():
            execution(* com.example.aop.annotatepureaop.MessageWriter.writeMessage());
    before():doWriting(){
        System.out.println(prefix);
    }
    after():doWriting(){
        System.out.println(suffix);
    }
}
