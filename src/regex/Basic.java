package regex;

import java.util.regex.Pattern;

public class Basic {

    public static void main(String[] args) {

        //Boundary Matchers
        boolean hello = Pattern.matches("^Hello$", "Hello");
        boolean namasteHello = Pattern.matches("^Hello$", "Namaster! Hello");
        boolean helloNamaste = Pattern.matches("^Hello$", "Hello Namaste");
        boolean helloNamasteHello = Pattern.matches("^Hello", "Hello Namaste Hello");
        boolean helloNamasteReggie = Pattern.matches("^Hello\\s\\w\\sHello$", "Hello Namaste Hello");


        //Quantifier
        boolean imtired = Pattern.matches("^[A-Z](\\s[a-zA-Z]+)+", "I am tired");
        boolean imtiredap = Pattern.matches("^[A-Z](\\D[a-z]*)*(\\s[a-zA-Z]+)+", "i'm in my Sunday zone");


        System.out.println(helloNamasteHello);
    }
}
