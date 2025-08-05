package com.DSA.Java;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
         boolean isSorted = true;

         int n = arr.length;


         for(int i = 0; i < n - 1 ; i++) {
             if(arr[i] > arr[i + 1]){
                 isSorted = false;
             }else{
                 isSorted = true;
             }
         }

         if(isSorted) {
             System.out.println("Array  is Sorted");
         }else{
             System.out.println("Array is not sorted...");
         }


    }



}


