package regex;

import java.util.regex.Pattern;

public class Intro {

    public static void main(String[] args) {

        //Options to define regular expression

        //String Literals
        boolean test = Pattern.matches("test", "match");

        //Character classes
        boolean test2 = Pattern.matches("[Tt]est", "test");
        boolean test3 = Pattern.matches("[ABC]@.", "WEB@JDOJO.COM");
        boolean test4 = Pattern.matches("[pqr]", "r");
        boolean test5 = Pattern.matches("[pqr]", "pq");
        boolean test6 = Pattern.matches("[pqr]", "pqr");

        //Meta characters [ and ] usage intr0 are below
        //Simple case study
        boolean simple = Pattern.matches("[csw]", "cave");
        boolean negation = Pattern.matches("[^abc]", "p");
        boolean range = Pattern.matches("[A-Za-z]", "B");
        boolean range2 = Pattern.matches("[A-Z][a-z]", "Aa");
        boolean union = Pattern.matches("[csw][a-v]", "cave");
        boolean intersection = Pattern.matches("[aeiouy&&[y]]", "y");
        boolean subtraction = Pattern.matches("[a-z&&[^m-p]]", "p");
        boolean subtraction2 = Pattern.matches("[a-f&&[^a-c]&&[^e]]", "d");

        //Boundary Matchers
        boolean hello = Pattern.matches("^Hello$", "Hello");
        boolean namasteHello = Pattern.matches("^Hello$", "Namaster! Hello");
        boolean helloNamaste = Pattern.matches("^Hello$", "Hello Namaste");
        boolean helloNamasteHello = Pattern.matches("^Hello", "Hello Namaste Hello");
        boolean helloNamasteReggie = Pattern.matches("^Hello\\s\\w\\sHello$", "Hello Namaste Hello");


        System.out.println(helloNamasteHello);
    }
}
