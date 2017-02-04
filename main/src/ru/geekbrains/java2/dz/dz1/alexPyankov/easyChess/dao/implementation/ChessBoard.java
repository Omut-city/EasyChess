package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.*;

/**
 * @author Alexander Pyankov (alex)
 * @version Alpha
 * @date Initial record from 04.02.17
 */
public class ChessBoard {
    final static private  String COLUMNS_ADDRESS = "abcdefgh";
    final static private int SIZE = 8;
    private ChessField chessFields [] [] = new ChessField[SIZE] [SIZE];

    private ChessBoard() {
        initChessBoard();
        setFiguresAtStartPosition(this);
    }

    private static class Singleton{
        private static final ChessBoard INSTANCE = new ChessBoard();
    }

    public static ChessBoard getInstance(){
        return Singleton.INSTANCE;
    }

    private void initChessBoard() {
        boolean even = true;

        for (int horizontal = 0; horizontal < SIZE; horizontal++, even = !even) {
            for (int vertical = 0; vertical < SIZE; vertical++) {

                chessFields [horizontal] [vertical] = new ChessField (horizontal, vertical);
                chessFields [horizontal] [vertical].setChessFieldState(ChessFieldState.EMPTY);
                chessFields [horizontal] [vertical].setFigure(null);

                if (even == true) {
                    even = false;
                    chessFields[horizontal][vertical].setColor(Color.BLACK);
                } else {
                    even = true;
                    chessFields[horizontal][vertical].setColor(Color.WHITE);
                }
            }
        }
    }

    private  void setFiguresAtStartPosition (ChessBoard board) {

    }

    public void printBoardState () {
        for (int horizontal = 0; horizontal < SIZE; horizontal++) {
            for (int vertical = 0; vertical < SIZE; vertical++) {
                ChessMan temp = chessFields [horizontal] [vertical].getFigure();
                if (chessFields [horizontal] [vertical]
                        .getChessFieldState()
                        .equals((ChessFieldState.EMPTY))) {

                    System.out.print (".");
                } else {
                    String str;

                    switch (temp.getTypeName()) {
                        case "Pawn":
                            str = "p";
                            break;
                        case "Castle":
                            str = "c";
                            break;
                        case "Knight":
                            str = "n";
                            break;
                        case "Bishop":
                            str = "b";
                            break;
                        case "Queen":
                            str = "q";
                            break;
                        case "King":
                            str = "k";
                            break;
                        default:
                            str = "-";
                            break;
                    }
                    if (temp.getColorTeam().equals(Color.WHITE))
                        str = str.toUpperCase();
                    if (temp.getColorTeam().equals(Color.BLACK))
                        str = str.toLowerCase();
                    System.out.print (str);
                 }
            }
            System.out.println();
        }
    }

    public void printBoard () {
        for (int horizontal = 0; horizontal < SIZE; horizontal++) {
            for (int vertical = 0; vertical < SIZE; vertical++) {
                if (chessFields [horizontal] [vertical].getColor().equals(Color.WHITE))
                    System.out.print(" ");
                else
                    System.out.print("x");
            }
            System.out.println();
        }
    }

    public ChessField getChessField (Coordinates coordinates) {
        return chessFields [coordinates.getHorizontal()] [coordinates.getVertical()];
    }

                        /*
                    System.out.print ("Field " + COLUMNS_ADDRESS.charAt(horizontal) + "" + vertical + " is empty");
                    System.out.print (temp.getCurrentPosition().getCoordinates().getHorizontal() + " " +
                            temp.getCurrentPosition().getCoordinates().getVertical() + " " +
                            temp.getColorTeam() + " " + temp.getName() + " " + temp.getStateFigure() + " " +
                            temp.getTypeName());
                    */
}
