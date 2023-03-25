package DSAs.Assco;

import java.util.*;

public class AsseccoTest {

    public static String reverseString(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-(i+1))) {
                return false;
            }
        }
        return true;
    }

    public static Set<String> permute(String s) {
        char[] charArr = s.toCharArray();
        Set<String> stringSet = new HashSet<>(Collections.singleton(s));
        for (int i = 0; i <= s.length()-1; i++) {
            char[] tempArr = charArr;
//            tempArr[0] = charArr[i];
            System.out.println(tempArr);
            for (int j = i; j < s.length()-2; j++) {
                char temp = tempArr[j+1];
                tempArr[j+1] = tempArr[j];
                tempArr[j] = temp;
                System.out.println(tempArr);
                System.out.println();
            }
            stringSet.add(new String(tempArr));
//            System.out.println(stringSet);
        }
        return Collections.singleton(stringSet.toString());
    }

    public static void main(String... args) {
//        System.out.println(reverseString("Assecco"));
//        System.out.println(isPalindrome("madam"));

        System.out.println(permute("dog"));
    }
}
