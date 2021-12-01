package com.kanth.algoexpert;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/*
*
  Given a non-empty string of lowercase letters and a non-negative integer
  representing a key, write a function that returns a new string obtained by
  shifting every letter in the input string by k positions in the alphabet,
  where k is the key.
  *
  *
  Note that letters should "wrap" around the alphabet; in other words, the
  letter z shifted by 1 returns the letter a.
* */

public class CaesarCipherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] letters = str.toCharArray();
        char[] newWord = new char[str.length()];
        //create alphabet
        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a",1);
        alphabet.put("b",2);
        alphabet.put("c",3);
        alphabet.put("d",4);
        alphabet.put("e",5);
        alphabet.put("f",6);
        alphabet.put("g",7);
        alphabet.put("h",8);
        alphabet.put("i",9);
        alphabet.put("j",10);
        alphabet.put("k",11);
        alphabet.put("l",12);
        alphabet.put("m",13);
        alphabet.put("n",14);
        alphabet.put("o",15);
        alphabet.put("p",16);
        alphabet.put("q",17);
        alphabet.put("r",18);
        alphabet.put("s",19);
        alphabet.put("t",20);
        alphabet.put("u",21);
        alphabet.put("v",22);
        alphabet.put("w",23);
        alphabet.put("x",24);
        alphabet.put("y",25);
        alphabet.put("z",26);

        int currentLocation = 0;
        int newLocation = 0;
        Optional<String> newLetter;
        int wrap = 0;
        int i = 0;
        Optional<String> updatedLetter;
        String nonOptionalLetter;

        for (char letter:letters) {
            String stringLetter = String.valueOf(letter);
            currentLocation = alphabet.get(stringLetter);
            if (currentLocation + key > 26) {
                wrap = getwrapAmount(key, currentLocation);
            }

            if (wrap > 0){
                newLocation = wrap;
            }else{
                newLocation = currentLocation + key;
            }

            newLetter = getKeys(alphabet, newLocation);
            nonOptionalLetter = newLetter.get();
            char charLetter = nonOptionalLetter.charAt(0);
            newWord[i] = charLetter;
            wrap = 0;
            i++;
        }

        return String.valueOf(newWord);
    }

    public static int getwrapAmount(int key, int currentLocation){
        int remainder;
        remainder = (currentLocation + key) % 26;
        return remainder;

    }

    private static Optional<String> getKeys(Map<String, Integer> map, Integer value) {

        return map
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .findFirst();

    }
}
