package com.DSA.Java;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5 , 4 , 3 , 2 , 1};

        int n = arr.length;

        for( int i = 0 ; i < n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }



}


