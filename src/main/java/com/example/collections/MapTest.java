package com.example.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by krishna_hotha on 6/3/15 2015.
 */
public class MapTest {


    public static void main(String[] args) {


        Map<String,String> hashMap=new HashMap<String,String>();

        hashMap.put("1","Krishna");
        hashMap.put("2","Raja");

        Map<String,String> childMap=new HashMap<String,String>();

        childMap.put("3","Pranav");
        childMap.put("4","Arnav");

        childMap.putAll(hashMap);

        System.out.println(hashMap.size());

        System.out.println(childMap.size());

    }
}
