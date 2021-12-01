package com.kanth.algoexpert;

import java.lang.reflect.Array;

/*
*   Write a function that takes in a sorted array of integers as well as a target
  integer. The function should use the Binary Search algorithm to determine if
  the target integer is contained in the array and should return its index if it
  is, otherwise -1
* */

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array,target, 0 , array.length-1);

    }

    public static int binarySearchHelper(int[] array, int target, int left, int right){
        int middle;
        int potentialMatch;

        while (left <= right){
            middle = (left + right)/2;
            potentialMatch = (int) Array.get(array,middle);
            if (target == potentialMatch){return middle;}
            else if(target < potentialMatch){return binarySearchHelper(array, target, left, middle-1);}
            else{return binarySearchHelper(array,target, middle+1, right);}

        }return -1;
    }
}
