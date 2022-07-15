package senseiQuestions;

public class QuestionFive {

    public static void solution(){
        int[] nums = {101, 4, 10, 13, 101, 200, 25, 23, 9, 100, 500, 9};
        int peak = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i-1] < nums[i] && nums[i+1] < nums[i] && peak < nums[i])
                peak = nums[i];
                index = i;
        }
        System.out.printf("The highest humber is %d at index %d.", peak, index);
    }

    public static void main(String[] args) {
        solution();
    }
}
