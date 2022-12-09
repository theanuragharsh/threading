package com.threadingbasics.threads;

import com.threadingbasics.resource.SharedProductResource;
import org.springframework.stereotype.Component;

@Component
public class BuyPen extends Thread {

    //    this class extends Thread class so this has both run and start methods in it
    //    so we don't need to create new thread of it's object
    //    we can directly use start method to run its thread
    //    so this method is a good practice to implement threading
    SharedProductResource sharedProductResource = null;

    public BuyPen(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    @Override
    public void run() {
        System.out.println("BuyPen --> " + sharedProductResource.buyProduct("Pen") + "placing order");
    }

}
