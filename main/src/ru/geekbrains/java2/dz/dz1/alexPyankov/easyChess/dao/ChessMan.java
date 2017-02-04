package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation.ChessBoard;
import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation.ChessField;

import java.net.CookieHandler;

/**
 * @author Alexander Pyankov
 * @version Alpha
 */
public abstract class ChessMan implements Movements {
    private ChessField currentPosition;
    private Color colorTeam;
    private String name;
    private String typeName;
    private ChessManState stateFigure;

    public ChessMan () {
    }

    public ChessMan (ChessBoard board, Coordinates coordinates, Color colorTeam, String name) {
        this.currentPosition = board.getChessField(coordinates);
        this.currentPosition.setChessFieldState(ChessFieldState.BUSY);
        this.name = name;
        this.colorTeam = colorTeam;
        this.stateFigure = ChessManState.ALIVE;
    }

    public Color getColorTeam() {
        return colorTeam;
    }

    public void setColorTeam(Color colorTeam) {
        this.colorTeam = colorTeam;
    }

    public ChessManState getStateFigure() {
        return stateFigure;
    }

    public void setStateFigure(ChessManState stateFigure) {
        this.stateFigure = stateFigure;
    }

    public Color getTeam() {
        return colorTeam;
    }

    public void setTeam(Color team) {
        this.colorTeam = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ChessField getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(ChessField currentPosition) {
        this.currentPosition = currentPosition;
    }
}

