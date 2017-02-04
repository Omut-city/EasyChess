package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation.*;

/**
 * @author Alexander Pyankov
 * @version Alpha
 * @date now()
 */

public interface Movements {
    void move (String moveTo);
    boolean checkMove (String moveTo);
    boolean checkAttack (ChessField field);
}
