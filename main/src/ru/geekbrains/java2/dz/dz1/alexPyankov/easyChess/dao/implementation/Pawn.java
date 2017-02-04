package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.ChessMan;
import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.Color;
import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.Coordinates;

/**
 * Created by alex on 03.02.17.
 */
public class Pawn extends ChessMan {
    public Pawn() {
        super();
    }

    public Pawn (ChessBoard board, Coordinates coordinates, Color team, String name) {
        super (board, coordinates, team, name);
    }

    @Override
    public void move(String moveTo) {

    }

    @Override
    public boolean checkMove(String moveTo) {
        return false;
    }

    @Override
    public boolean checkAttack(ChessField field) {
        return false;
    }
}
