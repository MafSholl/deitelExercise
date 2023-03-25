package DSAs.senseiQuestions;

public class ReverseString {

    public static String solution (String param) {
        StringBuilder reversedWord = new StringBuilder();
        for(int i=0; i < param.length(); i++) {
            reversedWord.append(param.charAt(param.length() - 1 - i));
        }
        return reversedWord.toString();
    }

    public static String solution2 (String param) {
        StringBuilder reversedWord = new StringBuilder();
        for(int i = param.length()-1; i >= 0; i--) {
            reversedWord.append(param.charAt(i));
        }
        return reversedWord.toString();
    }

    public static void main(String... args) {
        System.out.println(solution2("param"));
    }
}
