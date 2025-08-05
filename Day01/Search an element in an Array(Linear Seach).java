package com.DSA.Java;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Searching an Element in an Array

        // Using Linear Search

        int[] arr = {5 , 4 , 3 , 2 , 1};
        int target =  2;

        for( int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                System.out.println(target + " is Found at Index : "+ i);
            }
        }
    }
}


