package com.DSA.Java;


public class Main {
    public static void  main(String[] args) {
        String str = "123456789";

        boolean onlyDigits = str.matches("\\d+");

        if(onlyDigits) {
            System.out.println("String contains Digits Only");
        }else{
            System.out.println("String Can't contains Digits");
        }

    }
}



