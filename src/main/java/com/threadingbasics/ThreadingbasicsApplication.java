package com.threadingbasics;

import com.threadingbasics.resource.SharedProductResource;
import com.threadingbasics.threads.BuyBook;
import com.threadingbasics.threads.BuyPen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadingbasicsApplication {

    public static void main(String[] args) {

        SpringApplication.run(ThreadingbasicsApplication.class, args);
        SharedProductResource sharedProductResource = new SharedProductResource();
        BuyPen buyPen = new BuyPen(sharedProductResource);
        BuyBook buyBook = new BuyBook(sharedProductResource);

        Thread thread1 = new Thread(buyBook, "student1");
        thread1.start();

        Thread thread3 = new Thread(buyBook, "student2");
        thread3.start();

        buyPen.setName("student3");
        buyPen.start();

//        buyPen.setName("student4");
//        buyPen.start();
//
//        buyPen.setName("student5");
//        buyPen.start();
//
//        buyPen.setName("student6");
//        buyPen.start();

//        a thread can not be started multiple times i.e., a thread can be started only once


    }

}
