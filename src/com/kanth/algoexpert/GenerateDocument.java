package com.kanth.algoexpert;

import java.util.Map;
import java.util.TreeMap;
/*
*
  You're given a string of available characters and a string representing a
  document that you need to generate. Write a function that determines if you
  can generate the document using the available characters. If you can generate
  the document, your function should return true otherwise return false.
*
* */


public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {

        if (characters.length() < document.length()){
            return false;
        }
        if (document.isEmpty()){
            return true;
        }


        TreeMap<Integer, Integer> uniqueCharacters = hashChars(characters);
        TreeMap<Integer, Integer> uniqueDocument = hashChars(document);

        for(Map.Entry<Integer,Integer> entry :uniqueDocument.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            try {
                if (uniqueCharacters.containsKey(entry.getKey())) {
                     if (uniqueCharacters.get(entry.getKey()) < entry.getValue()) {
                        return false;
                    }
                }else{return false;}
            }catch (java.lang.NullPointerException nullPointerException){
                return false;
            }

        }
        return true;
    }


    public TreeMap<Integer, Integer> hashChars(String string){
        TreeMap<Integer, Integer> uniqueMap = new TreeMap<>();
        char[] letters = string.toCharArray();
        for (char letter:letters) {
            if  (uniqueMap.containsKey((int)letter)){
                Integer currentValue = uniqueMap.get((int)letter);
                Integer updateValue = currentValue++;
                uniqueMap.put((int)letter, currentValue);

            }else{uniqueMap.put((int)letter, 1);}
        }
        return uniqueMap;

    }
}
