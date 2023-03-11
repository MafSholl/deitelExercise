package DSAs.leetCode;

public class VerifyAlienDictionary_953 {
    public static boolean isAlienSorted(String[] words, String order) {
        //compare one index and the index next to it: words[i] and words[i+1]
        //compare the unicode character value of each word. How?
        //pick character at the same indexes of the two words[i] and words[i+1]
        //if unicode value of the character of the first word is less than it's corresponding neighbour of same index then 'it's true - return true. Else return false.
        //if they have same value, continue iterating until different value is found. Once a different value is found follow rule just above.
        int a = 0;
        String shorterWord = null;
        while (a < words.length-1) {
            if(words[a].length() < words[a+1].length()) {
                shorterWord = words[a];
            } else {
                shorterWord = words[a+1];
            }
            System.out.println(shorterWord);
            for(int i = 0; i < shorterWord.length(); i++) {
                if(order.indexOf(words[a].charAt(i)) < order.indexOf(words[a+1].charAt(i))) return true;
                else if(order.indexOf(words[a].charAt(i)) > order.indexOf(words[a+1].charAt(i))) return false;
            }
            a++;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String[] words1 = {"word","world","row"};
        String[] words2 = {"apple","app"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String order1 = "worldabcefghijkmnpqstuvxyz";
        String order2 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(isAlienSorted(words1, order1));
    }
}
