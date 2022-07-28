package senseiQuestions;

import java.util.ArrayList;

public class CutTheSticks {

    public void solution(int[] arr){
        int length = arr.length;
        int[] output;
        int smallestNumber = 0;
        for(int i = 0; i < length-1; i++) {
            if (arr[i+1] < arr[i]  && arr[i+1] != 0){
                smallestNumber =  arr[i];
            }
        }
        for (int i = 0; i < length; i++){
            arr[i]= arr[i] - smallestNumber;
        }
    }
}
