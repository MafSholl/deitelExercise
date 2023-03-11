package DSAs.senseiQuestions;

import java.util.Arrays;

public class AltTab {
    //This is one of interswitch's intern academy questions
    public static int[] solution(int length, int keyPress, int[] listOfWindows) {
        int[] solution = new int[length];
        solution[0] = listOfWindows[keyPress-1];
        for (int i = 1; i < listOfWindows.length; i++) {
            if (i>=keyPress) {
                solution[i] = listOfWindows[i];
            }
            else {
                solution[i] = listOfWindows[i-1];
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        int[] array = {9,6,8,4,5,8,10,3};
        System.out.println(Arrays.toString(solution(array.length, 8, array)));
    }
}
