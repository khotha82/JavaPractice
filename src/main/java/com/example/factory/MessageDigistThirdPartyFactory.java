package com.example.factory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by krishna_hotha on 4/17/15.
 */
public class MessageDigistThirdPartyFactory {


    private String algorithem="MD5";

    public String getAlgorithem() {
        return algorithem;
    }

    public void setAlgorithem(String algorithem) {
        this.algorithem = algorithem;
    }

    public MessageDigest getInstance() throws NoSuchAlgorithmException {

        return MessageDigest.getInstance(algorithem);
    }
}
