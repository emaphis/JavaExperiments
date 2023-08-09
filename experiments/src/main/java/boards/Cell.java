/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boards;

/**
 *
 * @author emaphis
 */
public class Cell {
    private final PieceType piece;
    private int score;

    public Cell(PieceType piece) {
        this.piece = piece;
        this.score = 0;
    }

    public char getGlyph() {
        return piece.getGlyph();
    }

    public boolean isEmpty() {
        return piece == PieceType.NONE;
    }

    public boolean isType(PieceType type) {
        return this.piece == type;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
