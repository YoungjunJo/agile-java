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
	static Piece[][] pieces =new Piece[8][8];
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
	
	public static void removePiece(int i, int j) {
		pieces[i][j] = Piece.createNoPiece();
	}
	

	/**
	 * Getting a specific position Piece
	 * @return Returns a Piece
	 */
	public static Piece getPiece(int i, int j) {
		return pieces[i][j];
	}
	
	
	public static void movePiece(int i, int j, int k, int l) {
		Piece piece = getPiece(i,j);
		if(piece.getType() == Type.KING) {
			moveKing(i, j, k, l);
		}
		else if(piece.getType() == Type.QUEEN) {
			moveQueen(i, j, k, l);
		}

	}
	
	public static void moveKing(int presentY, int presentX, int movingY, int movingX) {
		if(  (movingY-presentY)*(movingY-presentY) + (presentX-movingX)*(presentX-movingX) <= 2 ) {
		pieces[movingY][movingX] = pieces[presentY][presentX];
		removePiece(presentY, presentX);
		}
	}
	
	public static void moveQueen(int presentY, int presentX, int movingY, int movingX) {
		if(presentY - movingY == presentX - movingX) {
		pieces[movingY][movingX] = pieces[presentY][presentX];
		removePiece(presentY, presentX);	
		}
		else if(presentY == movingY) { 
		pieces[movingY][movingX] = pieces[presentY][presentX];
		removePiece(presentY, presentX);
		}
		else if(presentX == movingX) { 
		pieces[movingY][movingX] = pieces[presentY][presentX];
		removePiece(presentY, presentX);
		}
		
	}
}
