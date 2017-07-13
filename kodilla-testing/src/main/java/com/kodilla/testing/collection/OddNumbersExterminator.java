package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (Integer allNumbersArrayList : numbers){
            if (allNumbersArrayList % 2 == 0){
                newList.add(allNumbersArrayList);
            }
        }
        return newList;
    }
}
