package com.DSA.Java;



public class Main {

    public static void reverse(int arr[],int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

        public static void leftRotate(int[] arr , int k){
            int n = arr.length;
            k = k % n; // if k > n

            reverse(arr, 0, k - 1);         // Step 1: reverse first k elements
            reverse(arr, k, n - 1);         // Step 2: reverse remaining elements
            reverse(arr, 0, n - 1);   // Step 3 :- Reverse Whole Array
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        leftRotate(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }



}


