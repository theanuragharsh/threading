package com.threadingbasics.resource;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SharedProductResource {

    private Map<String, Integer> products = new HashMap<String, Integer>();

    public SharedProductResource() {
        products.put("Pen", 10);
        products.put("Pencil", 50);
        products.put("Notebook", 150);
        products.put("Ruler Scales", 10);
    }

    public synchronized String buyProduct(String key) {
        if (products.containsKey(key)) {
            Integer quantity = products.get(key);
            if (!products.get(key).equals(0)) {
                products.put(key, quantity - 1);
                return "ORDER PLACED SUCCESSFULLY for item :" + key + " is out for delivery." + Thread.currentThread().getName();
            }
        }
        return "ITEM NOT AVAILABLE" + Thread.currentThread().getName();
    }

}
