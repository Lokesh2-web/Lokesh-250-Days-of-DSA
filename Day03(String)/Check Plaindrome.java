package com.DSA.Java;

public class Main {
  public static void  main(String[] args) {
         String str = "madam";

         if(isPalindrome(str)){
             System.out.println(str + " is a palindrome");
         }else{
             System.out.println(str + " is not a palindrome");
         }
    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


