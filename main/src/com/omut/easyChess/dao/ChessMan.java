package com.omut.easyChess.dao;

/**
 * Created by alex on 03.02.17.
 */
public interface ChessMan {
    void move (String moveTo);
    boolean checkMove (String moveTo);
}
