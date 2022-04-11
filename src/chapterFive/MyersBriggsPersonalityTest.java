//package chapterFive;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.Scanner;
//
//public class MyersBriggsPersonalityTest {
//
//    private static int questionCount = 1;
//    private static String response;
//    private static int eCount = 0;
//    private static int iCount = 0;
//    private static int sCount = 0;
//    private static int nCount = 0;
//    private static int tCount = 0;
//    private static int fCount = 0;
//    private static int jCount = 0;
//    private static int pCount = 0;
//
//
//
//    public static void main(String[] args) {
////        while (questionCount <= 20 ) {
////            question(questionCount);
////            userResponse();
////            userBehaviourCounter();
////            userPersonalityStatement();
//
//    }
//
//
//    public static void personalityCounter(int questionCount, String response){
//        this.questiionCount = questionCount;
//
//        switch (questionCount) {
//            case 1:
//                switch (response) {
//                    case "A": eCount++;
//                    case "B": iCount++;
//                }
//            case 2:
//                switch (response) {
//                    case "A": sCount++;
//                    case "B": nCount++;
//                }
//            case 3:
//                switch (response) {
//                    case "A": tCount++;
//                    case "B": fCount++;
//                }
//            case 4:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//            case 5:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//            case 6:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//            case 7:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//            case 8:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//            case 9:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 10:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 11:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 12:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 13:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 14:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 15:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 16:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 17:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//             case 18:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//            case 19:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//                case 20:
//                switch (response) {
//                    case "A": jCount++;
//                    case "B": pCount++;
//                }
//        }
//    }
//
//
////    public static int userBehaviourCounter(@NotNull String response) {
////        int aCount = 0;
////        int bCount = 0;
////        if (response.equals("A")) aCount++; return aCount;
////        if (response.equals("B")) bCount++; return bCount;
////    }
//
//    public String userResponse() {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Your answer: ");
//            String response = input.next();
//            this.response = response;
//            return response;
//    }
//    public static String question (int questionCount){
//        String questionOutprint = null;
//        switch (questionCount) {
//            case 1:
//                questionOutprint =  "1. A:    , B: ";
//                break;
//            case 2:
//                 questionOutprint = "2. A:    , B:   ";
//                  break;
//             case 3:
//                 questionOutprint = "3. A:    , B: ";
//                 break;
//             case 4:
//                 questionOutprint = "4. A:    , B: ";
//                 break;
//             case 5:
//                 questionOutprint = "5. A:    , B: ";
//                 break;
//             case 6:
//                 questionOutprint = "6. A:    , B: ";
//                 break;
//             case 7:
//                 questionOutprint = "7. A:    , B: ";
//                 break;
//             case 8:
//                 questionOutprint = "8. A:    , B: ";
//                 break;
//             case 9:
//                 questionOutprint = "9. A:    , B: ";
//                 break;
//             case 10:
//                 questionOutprint = "10. A:    , B: ";
//                 break;
//             case 11:
//                 questionOutprint = "11. A:    , B: ";
//                 break;
//             case 12:
//                 questionOutprint = "12. A:    , B: ";
//                 break;
//             case 13:
//                 questionOutprint = "13. A:    , B: ";
//                 break;
//             case 14:
//                 questionOutprint = "14. A:    , B: ";
//                 break;
//             case 15:
//                 questionOutprint = "15. A:    , B: ";
//                 break;
//             case 16:
//                 questionOutprint = "16. A:    , B: ";
//                 break;
//             case 17:
//                 questionOutprint = "17. A:    , B: ";
//                 break;
//             case 18:
//                 questionOutprint = "18. A:    , B: ";
//                 break;
//             case 19:
//                 questionOutprint = "19. A:    , B: ";
//                 break;
//             case 20:
//            questionOutprint = "20. A:    , B: ";
//              }
//           return questionOutprint;
//        }
//    public static void userPersonalityStatement() {
//        if (eCount > iCount) {
//            System.out.println();
//        } else {
//            System.out.println();
//        }
//        if (sCount > nCount) {
//            System.out.println();
//        } else {
//            System.out.println();
//        }
//        if (tCount > fCount) {
//            System.out.println();
//        } else {
//            System.out.println();
//        }
//        if (jCount > pCount) {
//            System.out.println();
//        } else {
//            System.out.println();
//        }
//    }
//}
