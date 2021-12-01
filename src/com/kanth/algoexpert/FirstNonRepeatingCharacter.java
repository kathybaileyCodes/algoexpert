package com.kanth.algoexpert;
/*
*
  Write a function that takes in a string of lowercase English-alphabet letters
  and returns the index of the string's first non-repeating character.
* */


public class FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                return string.indexOf(i);
            }
        }
        return -1;
    }
}
