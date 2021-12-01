package com.kanth.algoexpert;

/*
* Write a function that takes in an integer
  and returns the nth Fibonacci number.
* */

public class NthFibonacci {
    public static int getNthFib(int n) {
        // Write your code here.
        int start = 0;
        int fwd = 1;
        int fibonacci = 0;
        if (n == 1){return 0;}
        fibonacci = start + fwd;
        for (int i = 3; i < n; i++) {
            start = fwd;
            fwd = fibonacci;
            fibonacci = start + fwd;
        }


        return fibonacci;
    }
}
