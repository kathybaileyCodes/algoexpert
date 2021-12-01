package com.kanth.algoexpert;

/*
*
  Write a function that takes in an array of integers and returns a sorted
  version of that array. Use the Insertion Sort algorithm to sort the array.
* */

public class InsertionSort {
    public static int[] insertionSort(int[] array) {

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }
}
