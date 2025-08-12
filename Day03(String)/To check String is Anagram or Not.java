package com.DSA.Java;

import java.util.Arrays;

public class Main {


    public static void  main(String[] args) {
        String s1 = "LISTEN";
        String s2 = "SILENT";
      
        if(isAnagram(s1,s2)){
            System.out.println("Strings Are Anagram");
        }else{
            System.out.println("Strings are Not Anagram");
        }
    }

    public static boolean isAnagram(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
         return Arrays.equals(c1,c2);
    }
}


