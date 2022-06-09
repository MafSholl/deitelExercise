package chapterEight;

import java.util.Scanner;

import static chapterEight.Value.EMPTY;

public class Player2 implements Player{

    private final Value O = Value.O;

    @Override
    public void play(int position, Value[][] board) {
        if (getValueAtIndex(position,board) == EMPTY) {
            if (position == 1) board[0][0] = O;
            else if (position == 2) board[0][1] = O;
            else if (position == 3) board[0][2] = O;
            else if (position == 4) board[1][0] = O;
            else if (position == 5) board[1][1] = O;
            else if (position == 6) board[1][2] = O;
            else if (position == 7) board[2][0] = O;
            else if (position == 8) board[2][1] = O;
            else if (position == 9) board[2][2] = O;
        }else{
            System.out.println("Square already filled");
            System.out.println("Enter another number");
            Scanner input = new Scanner(System.in);
            int newInput = input.nextInt();
            position = newInput;
            play(position, board);
        }
    }

    private Value getValueAtIndex(int index, Value[][] board) {
        if (index == 1) return board[0][0];
        else if (index == 2) return board[0][1];
        else if (index == 3) return board[0][2];
        else if (index == 4) return board[1][0];
        else if (index == 5) return board[1][1];
        else if (index == 6) return board[1][2];
        else if (index == 7) return board[2][0];
        else if (index == 8) return board[2][1];
        else if (index == 9) return board[2][2];
        return EMPTY;
    }
}
