package senseiQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Foobar {

    public static void solution(int number){
        int breaker;
        int counter;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i < number; i++){
            if (i/(number-i)== 3){
                System.out.println(array.add((int)Math.sqrt(i)));
                number = number-i;
                i = 1;
            }
        }

//        System.out.println(array.toString());
    }

    public static void main(String[] args) {
        solution(108);
    }
}
