package com.threadingbasics.threads;

import com.threadingbasics.resource.SharedProductResource;
import org.springframework.stereotype.Component;

@Component
public class BuyBook implements Runnable {

//    this class implements Runnable interface so, we need to create a thread from its object
//    we can then start the thread
//    so this is not the best approach to create threads

    SharedProductResource sharedProductResource = null;

    public BuyBook(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    @Override
    public void run() {
        System.out.println("Buy Book -->" + "placing order.." + sharedProductResource.buyProduct("Book"));
    }
}
