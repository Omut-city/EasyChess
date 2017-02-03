package com.omut.easyChess.dao.implementation;

import com.omut.easyChess.dao.ChessMan;
import com.omut.easyChess.dao.Color;
import com.omut.easyChess.dao.State;

/**
 * Created by alex on 03.02.17.
 */
public class ChessField {
    private Color color;
    private State state;
    private ChessMan figure;

    public ChessField() {
    }

    public ChessField(Color color, State state) {
        this.color = color;
        this.state = state;
        this.figure = null;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ChessMan getFigure() {
        return figure;
    }

    public void setFigure(ChessMan figure) {
        this.figure = figure;
    }

}
