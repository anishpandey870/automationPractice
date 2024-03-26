package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    //@BeforeClass run before the execution of all method
    @BeforeAll
    public static void init() {
        System.out.println("initialize the test cases");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("this run before each test cases");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("this run after each test cases");
    }

    @Test
    public void addTest() {
        int res = Calculator.add(2, 5);
        int exp = 7;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void subtractTest() {
        int res = Calculator.subtract(10, 5);
        int exp = 5;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void multiTest() {
        int res = Calculator.multi(5, 5);
        int exp = 25;
        Assert.assertEquals(exp, res);
    }

    @Test
    public void divTest() {
        int res = Calculator.div(10, 2);
        int exp = 5;
        Assert.assertEquals(exp, res);
    }

    //it run only once after the execution of all method
    @AfterAll
    public static void cleanUp() {
        System.out.println("After all method the test cases");
    }
}
