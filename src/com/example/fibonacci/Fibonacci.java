package com.example.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static double fib(double n){
        double a=0,b=1,sum;
        if (n <= 0)
            return a;
        for (int i=1; i<=n; i++){
            System.out.println(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
            return a;
    }

    public static void main (String[] args){
        Scanner s = new Scanner(System.in); //For user input
        double n = s.nextDouble();
        fib(n);
    }
}

