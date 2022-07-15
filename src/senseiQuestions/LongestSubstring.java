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
            System.out.println("Loop " + count);
            if (sConcat.isEmpty()) {
                sConcat.append(sArrays[i]);
                System.out.println("First if here");
            }else if (!sConcat.toString().contains(sArrays[i])) {
                sConcat.append(sArrays[i]);
                System.out.println("Second if here");
            }else {
//                sConcat.deleteCharAt(sConcat.indexOf(sArrays[i])).append(sArrays[i]);
                if (sConcat.length() > longestSubstring.length()) {
                    longestSubstring = sConcat.toString();
                }
                sConcat.append(sArrays[i]);
                System.out.println("sConcat after append " + sConcat);
                sConcat.delete(sConcat.indexOf(sArrays[i]), sConcat.indexOf(sArrays[i]));
                System.out.println("sconcat after delete: " + sConcat);
                System.out.println("Third if here");
            }
            System.out.println(sConcat);
            System.out.println();
             count++;
        }
//        System.out.println(sConcat);
        System.out.println(longestSubstring.length());

    }

    public static void main(String[] args) {
        solution();
    }
}
