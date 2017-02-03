package com.omut.easyChess.application;

import com.omut.easyChess.dao.implementation.*;

/**
 * Created by alex on 03.02.17.
 */
public class Game {

    public static void main(String [] args) {
        ChessBoard board = ChessBoard.getInstance();
        System.out.println(board);
        board.printBoardState();
        board.printBoard();




    }



}
