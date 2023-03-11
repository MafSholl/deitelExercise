package DSAs.Assco;

import java.util.List;
import java.util.stream.Collectors;

public class A {

    protected void doSmth() {
        System.out.println("Do smth A");
    }
    protected void doSmthElse() {
        System.out.println("Do smth else A");
    }

    public static void main(String[] args) {
//        String str= "Example A";
//        str.replace("A","B");
//        System.out.println(str);

        List<String> lst = List.of("John", "James", "Mark","Joanna","Henry");
        lst = lst.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        System.out.println(lst);

    }
}

