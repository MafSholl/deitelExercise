package chapterEight;

import static chapterEight.Value.*;

public class TicTacToe {

    private Value board[][];

    private Player1 player1 = new Player1();

    private Player2 player2 = new Player2();
    private boolean isGame = true;
    private boolean isPlayer1Win;
    private boolean isPlayer2Win;
    private boolean isDraw;
    private int counter;


    public TicTacToe() {
        Value[][] board = new Value[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                board[i][j] = Value.EMPTY;
            }
        }
        this.board = board;
    }

    public int getRowLength() {
        return board.length;
    }

    public int getColumnLength() {
        return board[0].length;
    }

    public void add(int row, int column, Value element) {
        board[row][column] = element;
    }

    public Value getIndexElementAt(int row, int column) {
        return board[row][column];
    }

    public Value getValueX() {
        return X;
    }

    public Value getValueO() {
        return O;
    }

    public Value getValueEmpty() {
        return EMPTY;
    }

    public Value getValueAt(int index) {
        return board[0][0];
    }

    public void player1Play(int index) {

//        player1.play(index);
        player1.play(index, board);
        counter++;
    }

    public void player2Play(int index) {
        player2.play(index, board);
        counter++;
    }

    public Value getElementAtIndex(int index) {
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

    public void gameStatus() {
        if (isGame) {
            if (counter < 9) {
                if (!isPlayer1Win) {
                    if ((board[0][0] == X && board[0][1] == X && board[0][2] == X) || (board[0][0] == X && board[1][0]== X && board[2][0] == X) || (board[0][0] == X && board[1][1]==X && board[2][2] == X)) {
                            isPlayer1Win = true;
                            isGame = false;
                        }
                    if(board[0][0] == X){
                    } else if (board[0][2] == Value.X) {
                        if (board[1][2] == Value.X) {
                            if (board[2][2] == Value.X) {
                                isPlayer1Win = true;
                                isGame = false;
                            }
                        } else if (board[1][1] == X) {
                            if (board[2][0] == Value.X) {
                                isPlayer1Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[2][0] == Value.X) {
                        if (board[2][1] == Value.X) {
                            if (board[2][2] == Value.X) {
                                isPlayer1Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[1][0] == Value.X) {
                        if (board[1][1] == Value.X) {
                            if (board[1][2] == Value.X) {
                                isPlayer1Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[0][1] == Value.X) {
                        if (board[1][1] == Value.X) {
                            if (board[2][1] == Value.X) {
                                isPlayer1Win = true;
                                isGame = false;
                            }
                        }
                    }
                }
                if (!isPlayer2Win) {
                    if (board[0][0] == Value.O) {
                        if (board[0][1] == Value.O) {
                            if (board[0][2] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        } else if (board[1][0] == Value.O) {
                            if (board[2][0] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        } else if (board[1][1] == Value.O) {
                            if (board[2][2] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[0][2] == Value.O) {
                        if (board[1][2] == Value.O) {
                            if (board[2][2] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        } else if (board[1][1] == O) {
                            if (board[2][0] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[2][0] == Value.O) {
                        if (board[2][1] == Value.O) {
                            if (board[2][2] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[1][0] == Value.O) {
                        if (board[1][1] == Value.O) {
                            if (board[1][2] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        }
                    } else if (board[0][1] == Value.O) {
                        if (board[1][1] == Value.O) {
                            if (board[2][1] == Value.O) {
                                isPlayer2Win = true;
                                isGame = false;
                            }
                        }
                    }
                }
            } else {
                drawCalculator();
            }
        }
    }

    private void drawCalculator() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != EMPTY) {
                    if (!isPlayer1Win) {
                        if (!isPlayer2Win) {
                            isDraw = true;
                        }

                    }
                }
            }
        }
    }

    public boolean isPlayer1Win() {
        return isPlayer1Win;
    }

    public boolean isPlayer2Win() {
        return isPlayer2Win;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public Value[][] getBoard() {
        counter++;
        return board;
    }

    public void gamePlay(int playerOneInput, int playerTwoInput) {
        displayBoard();
        player1Play(playerOneInput);
        displayBoard();
        player2Play(playerTwoInput);
        displayBoard();
    }

}