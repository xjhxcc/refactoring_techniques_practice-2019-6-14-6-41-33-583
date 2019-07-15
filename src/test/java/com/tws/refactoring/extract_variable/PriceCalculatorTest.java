package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatorTest {
    PriceCalculator priceCalculator = new PriceCalculator();
    @Test
    public void should_return__when_give_0_and_0(){
        double price = priceCalculator.getPrice(0,0);
        Assert.assertEquals(0.0,price,0);
    }
    @Test
    public void should_return__when_give_500_and_20(){
        double price = priceCalculator.getPrice(500,20);
        Assert.assertEquals(10100.0,price,0);
    }
    @Test
    public void should_return__when_give_500_and_50(){
        double price = priceCalculator.getPrice(500,50);
        Assert.assertEquals(25100.0,price,0);
    }
    @Test
    public void should_return__when_give_500_and_10(){
        double price = priceCalculator.getPrice(500,10);
        Assert.assertEquals(5100.0,price,0);
    }
    @Test
    public void should_return__when_give_501_and_20(){
        double price = priceCalculator.getPrice(501,20);
        Assert.assertEquals(10119.0,price,0);
    }
    @Test
    public void should_return__when_give_501_and_50(){
        double price = priceCalculator.getPrice(501,50);
        Assert.assertEquals(25147.5,price,0);
    }
    @Test
    public void should_return__when_give_501_and_10(){
        double price = priceCalculator.getPrice(501,10);
        Assert.assertEquals(5109.5,price,0);
    }
    @Test
    public void should_return__when_give_10_and_50(){
        double price = priceCalculator.getPrice(10,50);
        Assert.assertEquals(550,price,0);
    }

    @Test
    public void should_return__when_give_10_and_20(){
        double price = priceCalculator.getPrice(10,20);
        Assert.assertEquals(220.0,price,0);
    }

    @Test
    public void should_return__when_give_10_and_10(){
        double price = priceCalculator.getPrice(10,10);
        Assert.assertEquals(110.0,price,0);
    }

}