package com.DSA.Java;


import java.util.Arrays;

public class Main {
     public static void nextPermutation(int[] arr) {
         int pivot = -1;
         int n = arr.length;

         // Finding Pivot Index

         for(int i = n- 2; i>= 0; i--){
             if(arr[i] < arr[i+1]){
                 pivot = i;
                 break;
             }
         }

         if(pivot == -1){
             reverse(arr,0,n-1);
             return;
         }

         // find the Element that is Slightly grater then pivot index
         // The Loop with start from End Now

         for(int i = n - 1; i > pivot; i--){
             if(arr[i] > arr[pivot]){
                 swap(arr,i,pivot);
                 break;
             }
         }

         // After Swapping Reverse the  Array from pivot next element to the End
         reverse(arr,pivot + 1,n-1);

     }
     public static void reverse(int[] arr, int start, int end){
         while(start < end){
             swap(arr, start, end);
             start++;
             end--;
         }
     }
     public static void swap(int[] arr, int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
    public static void  main(String[] args) {

        int[] arr = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));


    }
}



