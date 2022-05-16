package chapterSeven;

import java.util.Random;

public class StudentGrader {

    private static int noOfStudent;
    private static int noOfSubjects;
    private static int[][] studentGrades;
    private static int [] totalArrays;
    private static double [] averageArrays;
    private static int [] positionArrays;


    public static void arrayInitializer(int studentNumber, int  subjectNumber){
        noOfStudent = studentNumber;
        noOfSubjects = subjectNumber;
//        System.out.println("Enter the number of your student: ");
//        input = new Scanner(System.in);
//        studentNumber = input.nextInt();
//        System.out.print("Enter the number of your student: ");
//        subjectNumber = input.nextInt();
//        System.out.println();
        studentGrades = new int[noOfStudent][noOfSubjects];
    }

    public static void studentGradeLoader(int score){
        int studentCount = 1;
        Random random = new Random();
        for(int i = 0; i < noOfStudent; i++){
            int subjectCount = 1;
//            System.out.println("Student " + studentCount);
            studentCount++;
            for(int j = 0; j < noOfSubjects; j++){
                System.out.printf("Enter grade for subject %d:%n", subjectCount);
                studentGrades[i][j] = random.nextInt(30,100);
                subjectCount++;
                score += 5;
                System.out.println(studentGrades[i][j]);
            }
        }
    }

    public int getStudentGraderArrayLength() {
        return studentGrades.length;
    }

    public int getStudentGraderContent(int studentNom, int subjectNom) {
        return studentGrades[studentNom][subjectNom];
    }

    public void studentGradeArrayLoader(int student, int subject, int score) {
        noOfStudent = student;
        noOfSubjects = subject;
        studentGrades[noOfStudent][noOfSubjects] = score;
    }

    public static void totalArrayLoader(){
        totalArrays = new int[noOfStudent];
        for(int i = 0 ; i < noOfStudent; i++){
            int studentTotalScore = 0;
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore = studentTotalScore + studentGrades[i][j];
            }
            totalArrays[i] = studentTotalScore;
        }
    }

    public static void totalGradeCalculator(){
        int studentCount = 1;
        for(int i = 0; i < noOfStudent; i++){
            int studentTotalScore = 0;
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore += studentGrades[i][j];
            }
            System.out.printf("Student %d total score is %d.%n", studentCount, studentTotalScore);
            studentCount++;
        }
    }

    public static void averageGradeLoader(){
        averageArrays = new double [noOfStudent];
        for(int i = 0; i < noOfStudent; i++){
            int studentTotalScore = 0;
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore = studentTotalScore + studentGrades[i][j];
            }
            double studentAverageScore = (double) studentTotalScore/noOfSubjects;
            averageArrays[i] =  studentAverageScore;
        }
    }

    public static void averageGradeCalculator(){
        int studentCount = 1;
        for(int i = 0; i < noOfStudent; i++){
//            System.out.println("Student " + studentCount);
            int studentTotalScore = 0;
            for(int j = 0; j < noOfSubjects; j++){
                studentTotalScore += studentGrades[i][j];
            }
            double studentAverageScore = (double) studentTotalScore / noOfSubjects;
            System.out.printf("Student %d average score is %.2f.%n", studentCount, studentAverageScore);
            studentCount++;
        }
    }

    public static void positionArrayLoader() {
        positionArrays = new int[noOfStudent];
        for (int i = 0; i < totalArrays.length; i++) {
            positionArrays[i] = totalArrays[i];
        }
    }

    public static void  positionSetter(){
        System.out.println();
        boolean flag = true;
        int temp;
        for(int i = 0; i < positionArrays.length; i++) {
//            flag = false;
            for (int j = 0; j < positionArrays.length-1; j++) {
                if (positionArrays[j] < positionArrays[j+1]) {
                   temp = positionArrays[j];
                   positionArrays[j] = positionArrays[j+1];
                   positionArrays[j+1] = temp;
//                   flag = true;
                }
            }
        }
    }

    public static void positionCalculator(){
        positionArrayLoader();
        positionSetter();
    }

    public static void gradeTableHeader(){
        System.out.print("""
                =========================================================================
                """);
        System.out.print("STUDENT       ");
        for(int i = 1; i <= noOfSubjects; i++){
            System.out.printf("%s%d   ", "SUB", i);
        }
        System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");
        System.out.println("""
                =========================================================================
                """);

    }

    public static void gradeTableContent(){
        int studentCount = 1;
        for(int i = 0; i < noOfStudent; i++){
            System.out.print("Student " + studentCount + "      ");
            int position = 0;
            for(int j = 0; j < noOfSubjects; j++){
                System.out.print(studentGrades[i][j] + "     ");
            }
            for(int j = 0; j <= noOfStudent; j++){
                if(totalArrays[i] == positionArrays[j]){
                    position = j + 1;
                    break;
                }
            }
            System.out.printf("%9d%11.2f%9d%n", totalArrays[i], averageArrays[i], position);
            studentCount++;
            System.out.println();
        }
    }

    public static void gradeTableFooter(){
        System.out.print("""
                =========================================================================
                """);

        System.out.print("""
                =========================================================================
                """);
        System.out.println();
    }



    public static void gradeTable(){
        gradeTableHeader();
        gradeTableContent();
        gradeTableFooter();
    }

    public static void subjectSummary(){

        int hardestSubjectCount = 0;
        int hardestSubjectFlag;
        int hardestSubjectFlagKeep = 0;

        int easiestSubjectCount = 0;
        int easiestSubjectFlag;
        int easiestSubjectFlagKeep = 0;

        int overallHighestScore = 0;
        int highestScorerIdNum = 0;
        int highestScoredSubjectNum = 0;

        int overallLowestScore = Integer.MAX_VALUE;
        int lowestScorerIdNum = 0;
        int lowestScoredSubjectNum = 0;

        for(int a = 0; a < noOfSubjects; a++) {
            System.out.printf("Subject %d%n", a+1);
            int highestSubjectScore = studentGrades[0][a];
            int highestStudentNumber = 1;
            int lowestSubjectScore = studentGrades[0][a];
            int lowestStudentNumber = 1;

            for (int i = 0; i < noOfStudent - 1; i++) {
                for (int j = a; j <= a; j++) {
                    if (highestSubjectScore < studentGrades[i + 1][j]){
                        highestSubjectScore = studentGrades[i + 1][j];
                        highestStudentNumber = i + 1;
                    }
                    if(studentGrades[i + 1][j] < lowestSubjectScore){
                        lowestSubjectScore = studentGrades[i + 1][j];
                        lowestStudentNumber = i + 1;
                    }
                }
            }
            int subjectTotalScore = 0;
            double subjectAverageScore = 0;
            int subjectPassCount = 0;
            int subjectFailureCount = 0;
            hardestSubjectFlag = 0;
            easiestSubjectFlag = 0;
            for(int i = 0; i < noOfStudent; i++){
                for(int j = a; j <= a; j++){
                    subjectTotalScore += studentGrades[i][j];
                    subjectAverageScore = (double) subjectTotalScore/noOfStudent;

                    if(studentGrades[i][j] >= 40){
                        subjectPassCount++;
                        easiestSubjectFlag++;
                    }
                   if(studentGrades[i][j] < 40){
                        subjectFailureCount++;
                        hardestSubjectFlag++;
                   }

                    if(studentGrades[i][j] > overallHighestScore){
                        overallHighestScore = studentGrades[i][j];
                        highestScorerIdNum = i + 1;
                        highestScoredSubjectNum = j + 1;

                    }

                    if(studentGrades[i][j] < overallLowestScore){
                        overallLowestScore = studentGrades[i][j];
                        lowestScorerIdNum = i + 1;
                        lowestScoredSubjectNum = j + 1;
                    }
                }
            }
            if(hardestSubjectFlag >= hardestSubjectFlagKeep){
                hardestSubjectFlagKeep = hardestSubjectFlag;
                hardestSubjectCount++;
            }

            if(easiestSubjectFlag >= easiestSubjectFlagKeep){
                easiestSubjectFlagKeep = easiestSubjectFlag;
                easiestSubjectCount++;
            }

            System.out.println("""
                =========================================================================
                """);
            System.out.printf("Highest scoring student is: Student %d scoring  %d%n", highestStudentNumber, highestSubjectScore);
            System.out.printf("Lowest scoring student is: Student %d scoring  %d%n", lowestStudentNumber, lowestSubjectScore);
            System.out.printf("Total score is: %d%n", subjectTotalScore);
            System.out.printf("Average score is: %.2f%n", subjectAverageScore);
            System.out.printf("Number of passes: %d%n", subjectPassCount);
            System.out.printf("Number of failures: %d%n%n", subjectFailureCount);
        }
        System.out.printf("The hardest subject is subject %d with %d failures %n", hardestSubjectCount, hardestSubjectFlagKeep);
        System.out.printf("The easiest subject is subject %d with %d passes %n", easiestSubjectCount, easiestSubjectFlagKeep);
        System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", highestScorerIdNum, highestScoredSubjectNum, overallHighestScore);
        System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", lowestScorerIdNum, lowestScoredSubjectNum, overallLowestScore);

        System.out.println("""
                =========================================================================
                """);
    }

    public static void classSummary(){
        System.out.println("CLASS SUMMARY");

        int bestGraduatingScore = 0;
        int bestGraduatingStudent = 0;
        int worstGraduatingScore = Integer.MAX_VALUE;
        int worstGraduatingStudent = 0;
        for(int i = 0; i < noOfStudent; i++){
            for(int j = 0; j < noOfSubjects; j++){
                if(studentGrades[i][j] > bestGraduatingScore){
                    bestGraduatingScore = studentGrades[i][j];
                    bestGraduatingStudent = i + 1;
                }
            }
        }
        for(int i = 0; i < noOfStudent; i++){
            for(int j = 0; j < noOfSubjects; j++){
                if(studentGrades[i][j] < worstGraduatingScore){
                    worstGraduatingScore = studentGrades[i][j];
                    worstGraduatingStudent = i + 1;
                }
            }
        }

        System.out.print("""
                =========================================================================
                """);
        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestGraduatingStudent,bestGraduatingScore );
        System.out.println("""
                =========================================================================
                """);

        System.out.print("""
                =========================================================================
                """);
        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstGraduatingStudent,worstGraduatingScore );
        System.out.println("""
                =========================================================================
                """);
    }



    public static void main(String[] args) {
        for (int i = 0; i <= 0; i++) {
            arrayInitializer(5, 3);
            studentGradeLoader(10);
            totalArrayLoader();
            averageGradeLoader();
//            totalGradeCalculator();
//            averageGradeCalculator();
            positionCalculator();
            gradeTable();
            subjectSummary();
            classSummary();
        }
    }
}