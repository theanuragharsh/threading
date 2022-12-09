package com.threadingbasics.threads;

import com.threadingbasics.resource.SharedProductResource;

public class BuyPen implements Runnable {

    SharedProductResource sharedProductResource = null;

    public BuyPen(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    @Override
    public void run() {
        System.out.println("BuyPen --> " + sharedProductResource.buyProduct("Pen") + "placing order");
    }

}
