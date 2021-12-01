package com.kanth.algoexpert;

/*
*
  Write a function that takes in an array of integers and returns a sorted
  version of that array. Use the Bubble Sort algorithm to sort the array.
* */

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        int n = array.length;
        int temporaryplace = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (array[j-1] > array[j]){
                    //swap elements
                    temporaryplace = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temporaryplace;
                }
            }
        }
        return array;
    }
}
