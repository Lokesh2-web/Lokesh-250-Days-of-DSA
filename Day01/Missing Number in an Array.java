package com.DSA.Java;

public class Main {

    public static void  main(String[] args) {
        int[] arr = { 1,2,4,5};

        int n = arr.length + 1;  //n = 5

        int expectedSum = n * (n + 1) / 2; // 15

        int actualSum = 0;

        for(int num : arr) {
            actualSum= actualSum + num;
        }

        int Missing = expectedSum - actualSum;

        System.out.println("Missing Number is :" + Missing);  
      // Output :- 3
    }
}


