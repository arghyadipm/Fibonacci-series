package com.example.fibonacci;

import org.junit.Test;

public class FibonacciTest {

    @Test
    /*1st test case with input n=8 and using assertArrayEquals() for expected and result as it contains series of output*/
    public void test1() {
        Fibonacci tester = new Fibonacci();
        double[] expectedArray = {0,1,1,2,3,5,8,13};

        double resultArray =  tester.fib(8);

    }

    @Test
    /*2st test case with input n=0 resulting in expected and result array as 0*/
    public void test2() {
        Fibonacci tester = new Fibonacci();
        double[] expectedArray = {0};

        double resultArray = tester.fib(0);
    }

    @Test
    /*3rd test case with input n=-4 (signed integer) resulting in expected and result array as 0*/
    public void test3() {
        Fibonacci tester = new Fibonacci();
        double[] expectedArray = {0};

        double resultArray = tester.fib(-4);
    }

    @Test
    /*4th test case with input n=5.5 (float input) which gives the same output as when n=5*/
    public void test4() {
        Fibonacci tester = new Fibonacci();
        double[] expectedArray = {0,1,1,2,3};

        double resultArray = tester.fib(5.5);
    }
}