package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.*;

/**
 * @author Alexander Pyankov (alex)
 * @version Alpha
 * @date Initial record from 04.02.17
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
