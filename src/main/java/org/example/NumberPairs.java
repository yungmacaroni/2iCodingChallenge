package org.example;

import java.util.*;

/*
* Class searches through a given array of integers and finds pairs that sum to the given integer.
* Created by Massimo Demarco
* 27/08/2023
* */


public class NumberPairs {
    public static int sumToInt(int[] numbers, int x) {

        // Used ArrayList as more flexible than array.
        List<Integer> numberList = new ArrayList<>();
        List<Integer> usedItemIndex = new ArrayList<>();
        int numberOfPairs = 0;


        // Remove any numbers greater than target sum, store possible numbers in new array.
        for (int n: numbers){
            if (n <= x){
                numberList.add(n);
            }
        }

        // Loop through new array with embedded loop for numbers. Assuming data entered is not too large.
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {

                // Count new pair found only if current item indexes have not been used already.
                if (numberList.get(i) + numberList.get(j) == x && !usedItemIndex.contains(i) && !usedItemIndex.contains(j)) {
                    numberOfPairs++;
                    usedItemIndex.add(i);
                    usedItemIndex.add(j);
                }
            }
        }

        return numberOfPairs;
    }
}