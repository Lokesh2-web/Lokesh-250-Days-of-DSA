package com.DSA.Java;

import java.util.HashMap;

public class Main {
    public static void  main(String[] args) {
        String str = "programming";
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        // HashMap Stores the Count of a character -- means how much time a character Repeats

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
          //Default Value of Key is 0
          // If character get inserted into Map then the Count will increase by 1
          // And if it comes Second time then the value will increase by 1 + 1 = 2 
        }

        System.out.println("Duplicate Elements");
        for(char c: map.keySet()) {
          // Taking out all the unique key from the Hashset
            if(map.get(c) > 1){
                System.out.println(c + " - "+map.get(c));
            }
        }
    }
}



