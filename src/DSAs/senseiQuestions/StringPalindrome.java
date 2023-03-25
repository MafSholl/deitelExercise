package DSAs.senseiQuestions;

public class StringPalindrome {

    public static boolean isPalindrome(String param) {
        StringBuilder b = new StringBuilder();
        StringBuilder sb = new StringBuilder(param);
        return param.equals(sb.reverse().toString());
    }

    public static boolean isPalindrome2(String param) {
        for(int i = 0; i < param.length()/2; i++ ) {
            if(param.charAt(i)!=param.charAt(param.length()-(i+1))) return false;
        }
        return true;
    }

    public static boolean isPalindrome3(String param) {
        for (int i = 0; i < param.length()/2; i++) {
            if (!(param.charAt(i) == param.charAt(param.length() - (i + 1)))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome3("pap"));
    }
}
