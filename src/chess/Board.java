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
	 * Getting a number of a specific Pieces
	 * @param color WHITE or BLACK
	 * @param type  PAWN/ROOK/KINGHT/BISHOP/QUEEN/KING
	 * @return Returns the number of a specific Pieces on the Board
	 */
	public int getNumberOfSpecificPiece(Color color, Type type) {
		//question for문(자료형 변수:배열) 형식으로 2중배열도 가능한가
		for(int i = 0 ; i < CHESS_COLUMN ; i++)
			for(int j = 0 ; j < CHESS_COLUMN ; j++)
				if((pieces[i][j].getType()==type) && (pieces[i][j].getColor()==color)){
					piecesCount++;
				}
		return piecesCount;				
	}
	
	/**
	 * Getting a specific position Piece
	 * @return Returns a Piece
	 */
	public Piece getPiece(int i, int j) {
		return pieces[i][j];
	}
	
	/**
	 * Initializing all Pieces on the chess board
	 */
	
	

	
	public void moveKing(int i, int j, int k, int l) {
		if(  (k-i)*(k-i) + (j-l)*(j-l) <= 2 ) {
		pieces[k][l] = pieces[i][j];
		removePiece(i,j);
		}
	}
	
}
