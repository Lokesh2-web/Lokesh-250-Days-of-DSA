package com.DSA.Java;


import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5};
        HashSet<Integer> set = new HashSet<>();

        for(int value : arr){
            set.add(value);
        }

        // converting set to an array

        int[] uniqueArr = new int[set.size()];

        int index = 0;

        for(int num : set){
            uniqueArr[index++] = num;
        }

        System.out.println(Arrays.toString(uniqueArr));


    }



}


