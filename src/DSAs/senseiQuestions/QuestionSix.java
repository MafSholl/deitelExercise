package DSAs.senseiQuestions;

import java.util.Arrays;

public class QuestionSix {
    public static void solution(int target){
        int [] nums = {1, 3 , 5, 54, 8, 9, 15};
        int [] soln = new int[2];
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i + 1; j < nums.length-1; j++){
                if((nums[i] + nums[j]) == target){
                    soln[0] = i; soln[1] = j;
                    break;
                }
            }
        }
        if(soln[0] == 0 && soln[1] == 0) soln[0]= -1;
        System.out.println(Arrays.toString(soln));
    }

    public static void main(String[] args) {
        solution(8);
    }
}
