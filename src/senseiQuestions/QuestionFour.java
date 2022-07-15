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

    public static void numSolution(int[] nums){
        int count = 0;
//        for (int i = 1; i < nums.length-1; i++) {
//            if (nums[i-1] == 0 && nums[i+1] == 0){
//                count++;
//            }
//        }
//        for (int loop = 1; loop <= count; loop++) {
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] == 0) {
//                    for (int j = i; j < nums.length - 1; j++) {
//                        if (nums[i + 1] == 0) {
//                            continue;
//                        }
//                        nums[j] = nums[j + 1];
//                        nums[j + 1] = 0;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] == 0) {
//                for (int j = i; j < nums.length-1; j++){
//                    nums[j] = nums[j+1];
//                    nums[j+1] = 0;
//                }
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[count++]= nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {12,0,3,0,8,1,2,4,0,10};
        numSolution(nums);
    }



}
