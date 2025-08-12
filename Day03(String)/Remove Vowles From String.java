package com.DSA.Java;

import java.util.Arrays;

public class Main {


    public static void  main(String[] args) {
        String str = "Lokesh";
        String result = removeValueResult(str);

        System.out.println("Original String: "+str);
        System.out.println("Result String: "+result);
    }

    public static  String removeValueResult(String str) {
        String res = str.replaceAll("[aeiouAEIOU]","");
        return res;
    }

}


// Space- Complexity = o(n)
// Time - Complexity = O(n)

