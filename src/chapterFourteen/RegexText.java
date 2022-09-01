package chapterFourteen;

public class RegexText {

    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-Z]*");
    }

    public static void main(String[] args) {
        RegexText regexTest = new RegexText();
        System.out.println(regexTest.validateLastName("adesiAH"));
    }
}
