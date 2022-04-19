package chapterSeven;

public class StudentGrader {

    private static int noOfStudent;
    private static int noOfSubjects;
    private static int[][] studentGrades;
    private static int [] totalArray;
    private static int [] positionArray;


    public static void arrayInitializer(int studentNumber, int  subjectNumber){
        noOfStudent = studentNumber;
        noOfSubjects = subjectNumber;
//        this.noOfStudent = noOfStudent;
//        this.noOfSubjects = noOfSubjects;
//        System.out.println("Enter the number of your student: ");
//        input = new Scanner(System.in);
//        noOfStudent = input.nextInt();
//        System.out.print("Enter the number of your student: ");
//        noOfSubjects = input.nextInt();
//        System.out.println();
        studentGrades = new int[noOfStudent][noOfSubjects];
    }

    public int getStudentGraderArrayLength() {
        return studentGrades.length;
    }

    public int[][] getStudentGraderContent() {
        return studentGrades;
    }

    public int getStudentGraderElement(int student, int subject) {
        noOfStudent = student;
        noOfSubjects = subject;
        return studentGrades[noOfStudent][noOfSubjects];
    }

    public void studentGradeArrayLoader(int student, int subject, int score) {
        noOfStudent = student;
        noOfSubjects = subject;
        studentGrades[noOfStudent][noOfSubjects] = score;
    }

    public static void studentGradeArrayLoopLoader(int score){
        int studentCount = 1;
//        noOfStudent = student;
//        noOfSubjects = subjects;
        for(int i = 0; i < noOfStudent; i++){
            int subjectCount = 1;
            System.out.println("Student " + studentCount);
            studentCount++;
            for(int j = 0; j < noOfSubjects; j++){
                System.out.printf("Enter grade for subject %d:%n", subjectCount);
                studentGrades[i][j] = score;
                subjectCount++;
                score = score + 5;
                System.out.println(studentGrades[i][j]);
            }
        }
    }

    public static void studentGradeArrayTotalCalculator(){
        int studentCount = 1;
        for(int i = 0; i < noOfStudent; i++){
            int studentTotalScore = 0;
            System.out.println("Student " + studentCount);
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore = studentTotalScore + studentGrades[i][j];
            }
            System.out.printf("Student %d total score is %d.%n", studentCount, studentTotalScore);
            studentCount++;
        }
    }

    public static void averageGradeCalculator(){
        int studentCount = 1;
        double studentAverageScore = 0.0;
        for(int i = 0; i < noOfStudent; i++){
            System.out.println("Student " + studentCount);
            int studentTotalScore = 0;
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore = studentTotalScore + studentGrades[i][j];
                studentAverageScore = (double) studentTotalScore / noOfSubjects;
            }
            System.out.printf("Student %d average score is %.2f.%n", studentCount, studentAverageScore);
            studentCount++;
        }
    }



    public static void totalArrayLoader(){
        totalArray = new int[noOfStudent];
        for(int i = 0 ; i < noOfStudent; i++){
            int studentTotalScore = 0;
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore = studentTotalScore + studentGrades[i][j];
            }
            totalArray[i] = studentTotalScore;
            System.out.println("Totes Array "+ totalArray[i]);
        }
    }

    public static void highestToLowestArrayLoader() {
        positionArray = new int[noOfStudent];
        int highestNumber;
        for (int i = 0; i < noOfStudent; i++) {
            highestNumber = totalArray[i];
            for (int j = i; j < noOfStudent; j++) {
                if (totalArray[j] != positionArray[i]) {
                    if (totalArray[j] > highestNumber) {
                        highestNumber = totalArray[j];
//                    positionArray[j] = highestNumber;
                    }
                }
            }
            for (int k = i; k < noOfStudent; k++) {
                if (highestNumber > positionArray[i]) {
                    positionArray[i] = highestNumber;
                }
                System.out.println("Pos Array " + positionArray[i]);
            }
        }
    }

    public static void positionCalculator(){
        int firstPosition = totalArray[0];
        if(totalArray[1]  > firstPosition) firstPosition = totalArray[1];
        if(totalArray[2]  > firstPosition) firstPosition = totalArray[2];
//        if(positions[3]  > firstPosition) firstPosition = positions[3];

        int secondPosition = 0;
        if(firstPosition > totalArray[1] && totalArray[1] > totalArray[2]) secondPosition = totalArray[1];
        if(firstPosition > totalArray[2] && totalArray[2] > totalArray[1]) secondPosition = totalArray[2];
        if(firstPosition > totalArray[0] && totalArray[0] > totalArray[2]) secondPosition = totalArray[0];
        if(firstPosition > totalArray[2] && totalArray[2] > totalArray[0]) secondPosition = totalArray[2];
        if(firstPosition > totalArray[1] && totalArray[1] > totalArray[0]) secondPosition = totalArray[1];
        if(firstPosition > totalArray[0] && totalArray[0] > totalArray[1]) secondPosition = totalArray[0];

        int thirdPosition = 0;
        if(firstPosition == totalArray[0] && secondPosition == totalArray[1]) thirdPosition = totalArray[2];
        if(firstPosition == totalArray[0] && secondPosition == totalArray[2]) thirdPosition = totalArray[1];
        if(firstPosition == totalArray[1] && secondPosition == totalArray[0]) thirdPosition = totalArray[2];
        if(firstPosition == totalArray[1] && secondPosition == totalArray[2]) thirdPosition = totalArray[0];
        if(firstPosition == totalArray[2] && secondPosition == totalArray[1]) thirdPosition = totalArray[0];
        if(firstPosition == totalArray[2] && secondPosition == totalArray[0]) thirdPosition = totalArray[1];

        if(totalArray[0] == firstPosition ) System.out.println("1");
        else if(totalArray[0] == secondPosition) System.out.println("2");
        else System.out.println("3");

        if(totalArray[1] == firstPosition) System.out.println("1");
        else if(totalArray[1] == secondPosition) System.out.println("2");
        else System.out.println("3");

        if(totalArray[2] == firstPosition ) System.out.println("1");
        else if(totalArray[2] == secondPosition) System.out.println("2");
        else System.out.println("3");
    }


    public void graderResultDisplay(){
    }




    public static void main(String[] args) {
        arrayInitializer(3,2);
        studentGradeArrayLoopLoader( 10);
        studentGradeArrayTotalCalculator();
        averageGradeCalculator();
        totalArrayLoader();
//        positionCalculator();
        highestToLowestArrayLoader();
    }
}