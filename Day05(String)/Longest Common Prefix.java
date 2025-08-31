import java.util.Arrays;

class ArraysExample{
    public String longestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder(); // result = {}
        Arrays.sort( strs );

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            else {
                result.append( first[i] );
            }
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
    }
}
