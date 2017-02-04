package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.application;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.Color;
import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation.ChessBoard;
import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation.Team;

/**
 * @author Alexander Pyankov
 * @version Alpha
 */
public class Game {

    public static void main(String [] args) {
        ChessBoard board = ChessBoard.getInstance();
        Team whiteTeam = new Team(Color.WHITE, board);
        Team blackTeam = new Team(Color.BLACK, board);

        board.printBoardState();
        System.out.println();
        board.printBoard();




    }



}
