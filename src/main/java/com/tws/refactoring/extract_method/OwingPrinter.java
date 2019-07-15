package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;
        printBanner();
        outstanding=caculateOrderAmount(elements,outstanding);
        printDetail("name: "+name,"amount: " + outstanding);
    }
    private double caculateOrderAmount(Iterator<Order> elements,double outstanding){
        while (elements.hasNext()) {
            Order each = elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }
    private void printDetail(String str1,String str2){
        System.out.println(str1);
        System.out.println(str2);
    }
    private void printBanner() {
        printDetail("*****************************","****** Customer totals ******");
        System.out.println("*****************************");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
