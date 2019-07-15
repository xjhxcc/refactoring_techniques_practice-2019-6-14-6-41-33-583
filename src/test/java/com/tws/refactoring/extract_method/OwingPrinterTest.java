package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_print_banner_and_detail_given_given_call_print_banner() {
        OwingPrinter owingPrinter = new OwingPrinter();
        List<Order> items = new ArrayList<>();
        items.add(new Order(1.00));
        owingPrinter.printOwing("xu", items);
        String expectedStr = "*****************************\r\n" +
                "****** Customer totals ******\r\n" +
                "*****************************\r\n" +
                "name: xu\r\n" +
                "amount: 1.0\r\n";
        assertEquals(expectedStr, outContent.toString());
    }
}