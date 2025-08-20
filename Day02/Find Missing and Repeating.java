package com.DSA.Java;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> findTwoElements(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        int repeating = -1;
        int missing = -1;

        // Count frequency
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Find missing and repeating (1 to n only)
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] == 2) {
                repeating = i;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating); // first repeating
        res.add(missing);   // then missing

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};  // Example input
        ArrayList<Integer> ans = findTwoElements(arr);

        System.out.println("Repeating: " + ans.get(0));
        System.out.println("Missing: " + ans.get(1));
    }
}
