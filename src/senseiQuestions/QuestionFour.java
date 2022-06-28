package senseiQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionFour {

    /** Given an integer array nums, move all 0's to the end of it
     * while maintaining the relative order of the non-zero elements
     *
     * Node that you must do this in-place without making a copy of the array.
     *
     * Example 1:
     * Input: nums = [0,1,0,3,12]  Output: [1,3,12,0,0]
     *
     * Example 2:
     * Input: nums = [0] Output: [0] */

    private void numContentPrompt(int[] nums){
        Scanner input = new Scanner(System.in);
        String sentinel = "";
        System.out.println("Input five numbers");
        int count = 0;
        while (sentinel.equals("")){
            int nextNum = input.nextInt();
            nums[count] = nextNum;
            count++;
            if (count == 5){sentinel = "a";}
        }
    }
    public static void numSolution(){
        int [] nums = new int[5];
        for (int i = 0; i < nums.length; i++){
            if (nums[i]  == 0){
                for (int j = i; j < nums.length-1; j++){
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        numSolution();
    }



}
