package com.DSA.Java;


public class Main {
    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int index = 0; // yahaan pe non-zero elements store honge

        // Step 1: Non-zero elements ko left mein le aao
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Bachi hui jagah par 0 bhar do
        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroesToEnd(arr);
        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }



}


