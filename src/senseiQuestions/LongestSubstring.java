package senseiQuestions;

import java.util.Arrays;

public class LongestSubstring {

    public static void solution(){
        String s = "abcadeccdccd";
        String [] sArrays = s.split("");
        StringBuilder sConcat = new StringBuilder();
        String longestSubstring = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            System.out.println("Loop " + (i+1));
            if (sConcat.isEmpty()) {
                sConcat.append(sArrays[i]);
                if (sConcat.length() > longestSubstring.length()) {
                    longestSubstring = sConcat.toString();
                }
            }else if (!sConcat.toString().contains(sArrays[i])) {
                sConcat.append(sArrays[i]);
                if (sConcat.length() > longestSubstring.length()) {
                    longestSubstring = sConcat.toString();
                }
            }else {
                if (sConcat.length() > longestSubstring.length()) {
                    longestSubstring = sConcat.toString();
                }
                sConcat.delete(0, sConcat.indexOf(sArrays[i])+1).append(sArrays[i]);
            }
            System.out.println(sConcat);
            System.out.println();
             count++;
        }
        System.out.println(longestSubstring.length());
        System.out.println(longestSubstring);




    }



    public static void main(String[] args) {
        solution();
    }
}
