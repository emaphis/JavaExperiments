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
    private final PieceType pieceType;
    private int score;

    public Cell(PieceType pieceType) {
        this.pieceType = pieceType;
        this.score = 0;
    }

    public char getPiece() {
        return pieceType.getPiece();
    }

    public boolean isEmpty() {
        return pieceType == PieceType.NONE || pieceType == PieceType.ERROR;
    }

    public boolean isType(PieceType type) {
        return pieceType == type;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
