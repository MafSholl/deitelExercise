package DSAs.senseiQuestions;

import java.util.Random;
import java.util.Scanner;

public class QuestionTwo {

    public void solution(){

        int N = 5;
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfSizeN = new int[N];

        Random generator = new Random();

        for (int i = 0; i < arrayOfSizeN.length; i++){
            arrayOfSizeN[i] = generator.nextInt();
        }
        int totalChocolates = 0;
        for (int i = 0; i < arrayOfSizeN.length; i++){
            for(int j = 0; j < arrayOfSizeN[i]; j++){

            }
        }
    }
}
