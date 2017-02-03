package com.omut.easyChess.dao.implementation;

import com.omut.easyChess.dao.Color;
import com.omut.easyChess.dao.State;

/**
 * Created by alex on 03.02.17.
 */

public class ChessBoard {
    final static private int SIZE = 8;
    final static private  String COLUMNS_ADDRESS = "abcdefgh";
    private ChessField chessFields [] [] = new ChessField[SIZE] [SIZE];

    private ChessBoard() {
        initChessBoard();
    }

    private static class Singleton{
        private static final ChessBoard INSTANCE = new ChessBoard();
    }

    public static ChessBoard getInstance(){
        return Singleton.INSTANCE;
    }

    private void initChessBoard() {
        boolean even = true;

        for (int horisontal = 0; horisontal < SIZE; horisontal++, even = !even) {
            for (int vertical = 0; vertical < SIZE; vertical++) {

                chessFields [horisontal] [vertical] = new ChessField();
                chessFields [horisontal] [vertical].setState(State.EMPTY);
                chessFields [horisontal] [vertical].setFigure(null);

                if (even == true) {
                    even = false;
                    chessFields[horisontal][vertical].setColor(Color.WHITE);
                } else {
                    even = true;
                    chessFields[horisontal][vertical].setColor(Color.BLACK);
                }
            }
        }
    }

    public void printBoardState () {
        for (int horisontal = 0; horisontal < SIZE; horisontal++) {
            for (int vertical = 0; vertical < SIZE; vertical++) {
                if (chessFields [horisontal] [vertical].getState().equals(State.EMPTY)) {
                    System.out.println("Field " + COLUMNS_ADDRESS.charAt(horisontal) + "" + vertical + " is empty");
                }
            }
        }
    }

    public void printBoard () {
        for (int horisontal = 0; horisontal < SIZE; horisontal++) {
            for (int vertical = 0; vertical < SIZE; vertical++) {
                if (chessFields [horisontal] [vertical].getColor().equals(Color.WHITE))
                    System.out.print(" ");
                else
                    System.out.print("x");
            }
            System.out.println();
        }
    }
}
