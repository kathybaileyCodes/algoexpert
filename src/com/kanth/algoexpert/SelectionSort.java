package com.kanth.algoexpert;

/*
*
*
  Write a function that takes in an array of integers and returns a sorted
  version of that array. Use the Selection Sort algorithm to sort the array.
* */

public class SelectionSort {
    public int[] selectionSort(int[] array) {
        // Write your code here.
        int lowNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1; j++) {
                if (array[i] < array[j]){
                    lowNumber = array[i];
                    array[i] = array[j];
                    array[j] = lowNumber;
                }

            }
        }
        return array;
    }
}
