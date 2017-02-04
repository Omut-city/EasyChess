package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.*;

/**
 * Created by alex on 03.02.17.
 */
public class ChessField {
    private Coordinates coordinates;
    private Color color;
    private ChessFieldState chessFieldState;
    private ChessMan figure;

    public ChessField (int horizontal, int vertical) {
        this.coordinates = new Coordinates(horizontal, vertical);
        this.color = null;
        this.chessFieldState = ChessFieldState.EMPTY;
        this.figure = null;
    }

    public Coordinates getCoordinates () {
        return coordinates;
    }

    public void setCoordinates (Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ChessFieldState getChessFieldState() {
        return chessFieldState;
    }

    public void setChessFieldState(ChessFieldState chessFieldState) {
        this.chessFieldState = chessFieldState;
    }

    public ChessMan getFigure() {
        return figure;
    }

    public void setFigure(ChessMan figure) {
        this.figure = figure;
    }
}
