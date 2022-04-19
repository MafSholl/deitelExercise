package chapterSeven;

public class TicTactoe {
    public static void main(String [] args) {
        char [][] tictactoes = new char[3][3];

        tictactoes [0][0] = 'X';
        tictactoes [0][1] = 'O';
        tictactoes [0][2] = 'X';
        tictactoes [1][0] = 'X';
        tictactoes [1][1] = 'X';
        tictactoes [1][2] = 'X';
        tictactoes [2][0] = 'O';
        tictactoes [2][1] = 'X';
        tictactoes [2][2] = 'O';

        System.out.print(tictactoes [0][0] + " " + tictactoes [0][1] + " " + tictactoes [0][2] + " \n"
                + tictactoes [1][0] + " " + tictactoes [1][1] + " " + tictactoes [1][2] + " \n"
                + tictactoes [2][0] + " " + tictactoes [2][1] + " " + tictactoes [2][2] + " \n");
        System.out.println();

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(tictactoes[i][j]+" ");
            }
            System.out.println();
        }
    }
}
