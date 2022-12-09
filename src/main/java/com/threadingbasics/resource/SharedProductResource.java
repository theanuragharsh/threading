package com.threadingbasics.resource;

import java.util.HashMap;
import java.util.Map;

public class SharedProductResource {

    private Map<String, Integer> products = new HashMap<String, Integer>();

    public SharedProductResource() {
        products.put("Pen", 10);
        products.put("Pencil", 50);
        products.put("Notebook", 150);
        products.put("Ruler Scales", 10);
    }


}
