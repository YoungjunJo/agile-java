package chess;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import static util.StringUtil.NEWLINE;
import static pieces.Piece.CHESS_ROW;
import static pieces.Piece.CHESS_COLUMN;

/**
 * Provides a representation of a Chess Board
 * @author JYJ
 */
public class Board{
	Piece[][] pieces =new Piece[8][8];
	int piecesCount=0;
	
	/**
	 * Adding a Piece on the board
	 * @param color WHITE or BLACK
	 * @param type  PAWN/ROOK/KINGHT/BISHOP/QUEEN/KING
	 * @param i, j a specific array location Piece[i][j] 
	 */
	public void addPiece(int i, int j, Color color, Type type) {
		if(type == Type.PAWN)
			pieces[i][j]=Piece.createPawn(color);
		else if(type == Type.ROOK)
			pieces[i][j]=Piece.createRook(color);
		else if(type == Type.KNIGHT)
			pieces[i][j]=Piece.createKnight(color);
		else if(type == Type.BISHOP)
			pieces[i][j]=Piece.createBishop(color);
		else if(type == Type.QUEEN)
			pieces[i][j]=Piece.createQueen(color);
		else if(type == Type.KING)
			pieces[i][j]=Piece.createKing(color);
	}
	
	public void removePiece(int i, int j) {
		pieces[i][j] = Piece.createNoPiece();
	}
	

	/**
	 * Getting a specific position Piece
	 * @return Returns a Piece
	 */
	public Piece getPiece(int i, int j) {
		return pieces[i][j];
	}
	
}
