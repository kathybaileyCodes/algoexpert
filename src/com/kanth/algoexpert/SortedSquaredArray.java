package com.kanth.algoexpert;

import java.util.Arrays;

    /*
    *
  Write a function that takes in a non-empty array of integers that are sorted
  in ascending order and returns a new array of the same length with the squares
  of the original integers also sorted in ascending order.
  *
  * */

public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] newArray = new int[array.length];
        int i = 0;
        for (int number : array) {
            int squared = (number * number);
            newArray[i] = (int) squared;
            i++;
        }
        Arrays.sort(newArray);
        return newArray;
    }
}
