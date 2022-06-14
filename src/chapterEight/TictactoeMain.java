package chapterEight;

import java.util.Scanner;

public class TictactoeMain {

    static TicTacToe ticTacToe = new TicTacToe();
    static Player1 player1 = new Player1();
    static Player2 player2 = new Player2();


    public static void gameLoader() {

        System.out.print("       Loading");
        for(int i = 1; i <=10_000_000; i++){
            System.out.print("");
        }
        System.out.print(".");
        for(int i = 1; i <= 10_000_000; i++){
            System.out.print("");
        }
        System.out.print(".");
        for(int i = 1; i <= 10_000_000; i++){
            System.out.print("");
        }
        System.out.println(".");
        for(int i = 1; i <= 10_000_000; i++){
            System.out.print("");
        }

        System.out.println();
        System.out.println("    TicTactoe Game!");
        for(int i = 1; i <= 5_000_000; i++){
            System.out.print("");
        }
        System.out.println("  Developed By Shola");

        for(int i = 1; i <= 5_000_000; i++){
            System.out.print("");
        }


        int copyrightSymbolCodePoint = 169 ;
        String copyright = Character.toString(copyrightSymbolCodePoint) ;
        System.out.print(copyright);
        for(int i = 1; i <= 5_000_000; i++){
            System.out.print("");
        }
        System.out.println(" FuckShit Technologies");


        for(int i = 1; i <=25; i++) {
            System.out.print(">");
            for (int j = 1; j <= 2_500_000; j++) {
                System.out.print("");
            }
        }
        System.out.println();
    }

    public static void userPlayerPrompt(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Select 1 to be player 1         ");
        System.out.println("Select 2 to be player 2");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void gameRunnerConsole() {
        Scanner input = new Scanner(System.in);
        int playerOneInput;
        int playerTwoInput;

        int counter = 1;

        while (counter <= 9) {
            System.out.printf("%s %d turn%n", "Player One", 1);
            ticTacToe.displayBoard();
            do{
                playerOneInput = input.nextInt();
                if(playerOneInput == 0) System.out.println("Zero is an invalid number. Play figures between 1 & 9");
                if(playerOneInput > 9) System.out.println("Number out of range! Play figures between 1 & 9");
            }
            while (playerOneInput == 0 || playerOneInput > 9);

            player1.play(playerOneInput, ticTacToe.getBoard());
            ticTacToe.displayBoard();
            ticTacToe.gameStatus();
            if(ticTacToe.isPlayer1Win()){
                System.out.println("Player 1 wins");
                break;
            }

            System.out.printf("%s %d turn %n", "Player Two", 2);
            do{
                playerTwoInput = input.nextInt();
                if(playerTwoInput == 0) System.out.println("Zero is an invalid number. Play figures between 1 & 9");
                if(playerTwoInput > 9) System.out.println("Number out of range! Play figures between 1 & 9");
            }
            while (playerTwoInput == 0 || playerTwoInput > 9);

            player2.play(playerTwoInput, ticTacToe.getBoard());
            ticTacToe.displayBoard();
            ticTacToe.gameStatus();
            if(ticTacToe.isPlayer2Win()){
                System.out.println("Player 2 wins");
                break;
            }
            counter++;
        }
        if(ticTacToe.isDraw()){
            System.out.println("The game has ended in a draw!");
        }
    }

    public static void main(String[] args) {
        gameLoader();
        userPlayerPrompt();
        gameRunnerConsole();
    }
}
