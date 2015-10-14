package com.example.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * Created by krishna_hotha on 4/17/15.
 */
public class NameEditor extends PropertyEditorSupport {


    @Override
    public void setAsText(String text) throws IllegalArgumentException {

            System.out.println("setting the value");
            String [] s=text.split(" ");
            setValue(new Name(s[0],s[1]));
    }
}
