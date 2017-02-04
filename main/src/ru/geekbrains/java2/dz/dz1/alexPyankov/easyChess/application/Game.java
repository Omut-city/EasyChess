package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.application;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.*;
import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation.*;

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

        System.out.println(whiteTeam.currentAmountOfFigures());
        System.out.println(whiteTeam.getTeam().get(15).getColorTeam() + " " + whiteTeam.getTeam().get(15).getName());
        System.out.println(whiteTeam.getTeam().get(15).getCurrentPosition().getCoordinates().getVertical());
        System.out.println(whiteTeam.getTeam().get(15).getCurrentPosition().getCoordinates().getHorizontal());
        System.out.println(board.getChessField(new Coordinates(0, 0)).getChessFieldState());
    }
}
