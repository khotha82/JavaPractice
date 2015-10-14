package com.example.effjava.spf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by krishna_hotha on 6/22/15 2015.
 */
public class TravelServices {




    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    static{

        providers.put("train", new TrainProvider());
    }

    //register the provider
    public static void registerProvider(String name, Provider provider){
        providers.put(name, provider);
    }

    //service access API
    public static TravelService newInstance(String name){
        Provider provider = providers.get(name);
        if (provider == null){
            throw new IllegalArgumentException("Provider not found");
        }

        return provider.createService();
    }

}
