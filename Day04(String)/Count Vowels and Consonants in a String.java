package com.DSA.Java;
public class Main {
    public static void  main(String[] args) {
        String str = "programming";
        str = str.toLowerCase();
        int con = 0;
        int vol = 0;


        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c != ' '){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vol++;
                }
                else{
                    con++;
                }
            }
        }
        System.out.println("Vowels : "+vol);
        System.out.println("Consonants :"+con);
    }
}



