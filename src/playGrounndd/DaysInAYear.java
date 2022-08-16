package playGrounndd;

public class DaysInAYear {
    private final int DAY = 360;
    private final int MONTH = 30;

    public static void solution(int input){
        int year = input/360;
        int month = (input%360)/30;
        int days = (input%360)%30;

        System.out.printf("You have %d year, %d month and %d days in %d days ", year, month, days, input);
    }

    public static void main(String... args) {
        solution(30);
    }

    public int yearCalculator(int input) {
        return input/360;
    }

    public int monthCalculator(int input) {
        return (input%360)/30;
    }

    public int dayCalculator(int input) {
        return (input%360)%30;
    }
}
