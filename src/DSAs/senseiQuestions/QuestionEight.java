package DSAs.senseiQuestions;

import java.util.Arrays;

public class QuestionEight {

    public static void solution(){
        int[] nums2 = {11,15,18,24,25,36,39,40};
        int[] nums1 = {1,2,3,9,13,14,15,20,27,38,49,50};

        int newSize = nums1.length + nums2.length;
        int[] tempArray = new int[newSize];
        int count;
        int loopCounter;
        if (nums1.length > nums2.length) {
            count = nums2.length;
            loopCounter = nums1.length;
        }
        else {
            count = nums1.length;
            loopCounter = nums2.length;
        }
        for (int i = 0; i < loopCounter; i++) {
            if (i < nums1.length) tempArray[i] = nums1[i];
            tempArray[count++] = nums2[i];
        }
        System.out.println(Arrays.toString(tempArray));
        nums1 = tempArray;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length-1; j++) {
                if (nums1[j] > nums1[j+1]) {
                    int temp = nums1[j+1];
                    nums1[j+1] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String... args){
        solution();
    }
}
