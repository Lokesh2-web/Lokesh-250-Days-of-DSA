package com.DSA.Java;


import java.util.Collections;
import java.util.PriorityQueue;

public class Main1 {
    public  int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();

    }
    public static void main(String[] args) {
       Main1 obj = new Main1();
       int[] arr = {7, 10, 4, 3, 20, 15};
       int k = 3;
        System.out.println(obj.kthSmallest(arr,k));
    }
}
