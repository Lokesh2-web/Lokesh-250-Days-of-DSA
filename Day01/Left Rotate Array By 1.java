package com.DSA.Java;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};

            // left rotate By one

            int n = arr.length;

            int temp = arr[0];
            for(int i = 0; i < n- 1; i++){
                arr[i] = arr[i+1];
            }

            arr[n-1] =  temp;

            System.out.println(Arrays.toString(arr));
        }
}


