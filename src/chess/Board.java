package chess;

import pieces.Blank;
import pieces.Piece;
import pieces.Piece.Color;

/**
 * Provides a representation of a Chess Board
 * @author JYJ
 */
public class Board{
	Piece[][] pieces = new Piece[8][8];
	int piecesCount = 0;
	
	
	/**
	 * Getting a specific position Piece
	 * @return Returns a Piece
	 */
	public Piece getPiece(int sourceY, int sourceX) {
		return pieces[sourceY][sourceX];
	}
	
	public void removePiece(int sourceY, int sourceX) {
		pieces[sourceY][sourceX] = Blank.create(Color.NONE);
	}
	

	public void movePiece(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(piece.move(piece, sourceY, sourceX, destY, destX)) {
		pieces[destY][destX] = pieces[sourceY][sourceX];
		removePiece(sourceY, sourceX);
		}
	}

}
