package ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.implementation;

import ru.geekbrains.java2.dz.dz1.alexPyankov.easyChess.dao.*;
import java.util.ArrayList;

/**
 * @author Alexander Pyankov
 * @version Alpha
 */
public class Team {
    private Color teamColor;
    ArrayList<ChessMan> team;

    public Team() {
    }

    public Team(Color teamColor, ChessBoard board) {
        this.teamColor = teamColor;
        this.team = new ArrayList<>();
        int horizontal = -1;

        if (this.teamColor.equals(Color.BLACK))
            horizontal = 1;
        else
            horizontal = 6;

        team.add (new Pawn   (board, new Coordinates(horizontal,0), teamColor, "First Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,1), teamColor, "Second Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,2), teamColor, "Third Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,3), teamColor, "Fourth Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,4), teamColor, "Fifth Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,5), teamColor, "Sixth Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,6), teamColor, "Seventh Pawn"));
        team.add (new Pawn   (board, new Coordinates(horizontal,7), teamColor, "Eighth Pawn"));

        if (this.teamColor.equals(Color.WHITE))
            horizontal = 0;
        if (this.teamColor.equals(Color.BLACK))
            horizontal = 7;

        team.add (new Castle (board, new Coordinates(horizontal,0), teamColor, "Left Castle"));
        team.add (new Castle (board, new Coordinates(horizontal,7), teamColor, "Right Castle"));
        team.add (new Knight (board, new Coordinates(horizontal,1), teamColor, "Left Knight"));
        team.add (new Knight (board, new Coordinates(horizontal,6), teamColor, "Right Knight"));
        team.add (new Bishop (board, new Coordinates(horizontal,2), teamColor, "Left Bishop"));
        team.add (new Bishop (board, new Coordinates(horizontal,5), teamColor, "Right Bishop"));
        team.add (new Queen  (board, new Coordinates(horizontal,3), teamColor, "Queen"));
        team.add (new King   (board, new Coordinates(horizontal,4), teamColor, "King"));
    }

    public Color getTeamColor() {
        return teamColor;
    }

    public int currentAmountOfFigures () {
        return this.getTeam().size();
    }
    public void setTeamColor(Color teamColor) {
        this.teamColor = teamColor;
    }

    public ArrayList<ChessMan> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<ChessMan> team) {
        this.team = team;
    }
}
