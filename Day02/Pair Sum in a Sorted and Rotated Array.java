package com.DSA.Java;

import java.util.HashSet;

public class Main1 {

    public static boolean pairSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

       for(int num: arr){
           int complement = target - num;
           if(set.contains(complement)) {
               return true;
           }else{
               set.add(num);
           }
       }
       return false;
    }
    public static void main(String[] args) {
        Main1 obj = new Main1();

        int[] arr = {11,15,6,8,9,10};
        int target = 16;
        System.out.println(obj.pairSum(arr,target));
    }
}
