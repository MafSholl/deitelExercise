package tddTests;

import java.util.Scanner;

public class MyersBriggsPersonalityTest {

    private static int questionCount = 1;
    private static String response;
    private static int eCount = 0;
    private static int iCount = 0;
    private static int sCount = 0;
    private static int nCount = 0;
    private static int tCount = 0;
    private static int fCount = 0;
    private static int jCount = 0;
    private static int pCount = 0;

    public static void main(String[] args) {
        runMyersBriggsApplication();
    }

    public static void instructionPrompt() {
        System.out.println("Select either of the two options. Enter either \"A\" or \"B\"");
    }

    public static void runMyersBriggsApplication(){
        instructionPrompt();
        while (questionCount <= 20 ) {
            question();
            userResponse();
            personalityCounter();
            questionCount++;
        }
        userPersonalityStatement();
    }

    public static void question(){
        switch (questionCount) {
            case 1:
                System.out.println("1. A: expend energy, enjoy groups    B: conserve energy, enjoy one-on-one");
                break;
            case 2:
                System.out.println("2. A: interpret literally    B: look for meaning and possibilities");
                break;
            case 3:
                System.out.println("3. A: logical, thinking, questioning    B: empathetic, feeling, accommodating");
                break;
            case 4:
                System.out.println("4. A: organized, orderly    B: flexible, adaptable");
                break;
            case 5:
                System.out.println("5. A: more outgoing, think out loud    B: more reserved, think to yourself");
                break;
            case 6:
                System.out.println("6. A: practical, realistic, experiential    B: imaginative, innovative, theoretical");
                break;
            case 7:
                System.out.println("7. A: candid, straight forward, frank    B: tactful, kind, encouraging");
                break;
            case 8:
                System.out.println("8. A: plan, schedule    B: unplanned, spontaneous");
                break;
            case 9:
                System.out.println("9. A: seek many tasks, public activities, Interaction with others    B: seek private, solitary activities with quiet to concentrate");
                break;
            case 10:
                System.out.println("10. A: standard, usual, conventional    B: different, novel, unique");
                break;
            case 11:
                System.out.println("11. A: firm, tend to criticize, hold the line    B: gentle, tend to appreciate, conciliate");
                break;
            case 12:
                System.out.println("12. A: regulated, structured    B: easygoing, live and let live");
                break;
            case 13:
                System.out.println("13. A: external, communicative, express yourself    B: internal, reticent, keen to yourself");
                break;
            case 14:
                System.out.println("14. A: focus on here-and-now    B: look to the future, global perspective, big picture");
                break;
            case 15:
                System.out.println("15. A: tough-minded, just    B: tender-hearted, merciful");
                break;
            case 16:
                System.out.println("16. A: preparation, plan ahead    B: reflective, deliberate");
                break;
            case 17:
                System.out.println("17. A: active, Initiate    B: reflective, deliberate");
                break;
            case 18:
                System.out.println("18. A: facts, things, what is    B: ideas, dreams, What could be, philosophical");
                break;
            case 19:
                System.out.println("19. A: matter of fact, issue-oriented    B: sensitive, people-oriented, compassionate");
                break;
            case 20:
                System.out.println("20. A: control, govern    B: latitude, freedom");
                break;
        }
    }

    public static void userResponse() {
        Scanner input = new Scanner(System.in);
        System.out.print("Your answer: ");
        response = input.next();
    }

    public static void personalityCounter(){
        switch (questionCount) {
            case 1:
                switch (response) {
                    case "A": eCount++;
                    case "B": iCount++;
                }
            case 2:
                switch (response) {
                    case "A": sCount++;
                    case "B": nCount++;
                }
            case 3:
                switch (response) {
                    case "A": tCount++;
                    case "B": fCount++;
                }
            case 4:
                switch (response) {
                    case "A": jCount++;
                    case "B": pCount++;
                }
            case 5:
                switch (response) {
                    case "A": jCount++;
                    case "B": pCount++;
                }
            case 6:
                switch (response) {
                    case "A": jCount++;
                    case "B": pCount++;
                }
            case 7:
                switch (response) {
                    case "A": jCount++;
                    case "B": pCount++;
                }
            case 8:
                switch (response) {
                    case "A": jCount++;
                    case "B": pCount++;
                }
            case 9:
                switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 10:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 11:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 12:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 13:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 14:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 15:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 16:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 17:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 18:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 19:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
                case 20:
                    switch (response) {
                        case "A": jCount++;
                        case "B": pCount++;
                    }
            }
        }

        public static void userPersonalityStatement() {
            System.out.println();
            System.out.println("The result of your personality test are stated below >>>");
            if (eCount > iCount) {
                System.out.println("You're an Extrovert");
            } else {
                System.out.println("You're an Introvert");
            }
            if (sCount > nCount) {
                System.out.println("You have a sensor personality");
            } else {
                System.out.println("You have an intuit personality");
            }
            if (tCount > fCount) {
                System.out.println("You're a Thinker");
            } else {
                System.out.println("You're a Feeler");
            }
            if (jCount > pCount) {
                System.out.println("You're a Judger");
            } else {
                System.out.println("You're a Perceiver");
            }
        }
}
