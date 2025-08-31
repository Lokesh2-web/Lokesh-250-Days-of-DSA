import java.util.HashMap;

class ArraysExample{
    public static void printDuplicate(String str) {
        HashMap<Character, Integer> map  = new HashMap<>();

        char[] charArray = str.toCharArray();

        for(char c : charArray){
            if(c != ' '){
                map.put( c , map.getOrDefault( c, 0 ) + 1 );
            }
        }

        for(char c: map.keySet()) {
            if(map.get( c ) > 1){
                System.out.println(c + " --------> "+map.get(c));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String str = "programming";
        ArraysExample.printDuplicate( str );
    }
}
