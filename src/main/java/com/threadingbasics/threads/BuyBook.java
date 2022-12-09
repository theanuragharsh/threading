package com.threadingbasics.threads;

import com.threadingbasics.resource.SharedProductResource;
import org.springframework.stereotype.Component;

@Component
public class BuyBook extends Thread {
    SharedProductResource sharedProductResource = null;

    public void BuyBook(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    @Override
    public void run() {
        System.out.println("Buy Book -->" + sharedProductResource.buyProduct("Book") + "placing order..");
    }
}
