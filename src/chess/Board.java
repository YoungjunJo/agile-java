package chess;

import java.util.ArrayList;
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
public class Board {
	Piece[][] pieces =new Piece[8][8];
	int piecesCount=0;
	/**
	 * Adding a Pawn on the ArrayList
	 * @param pawn the Pawn will be added at the ArrayList
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
	
	/**
	 * Getting a number of pawns
	 * @return Returns the number of pawns in this list.
	 */
	public int getNumberOfPiece(Color color, Type type) {
		//question for(자료형 변수:배열) 형식으로 2중배열도 가능한가
		for(int i = 0 ; i < CHESS_COLUMN ; i++)
			for(int j = 0 ; j < CHESS_COLUMN ; j++)
				if((pieces[i][j].getType()==type) && (pieces[i][j].getColor()==color)){
					piecesCount++;
				}
					
		return piecesCount;
					
	}
	
	/**
	 * Getting a pieces first position
	 * @return Returns the pieces at the specified position in this list.
	 */
	public Piece getPiece(int i, int j) {
		return pieces[i][j];
	}
	
	/**
	 * Setting 8 row on the chess board
	 */
	public void initialize() {
		whiteInitialize();
		blackInitialize();
		noPieceInitialize();	
	}
	
	private void noPieceInitialize() {
		for(int i = 2; i < 6 ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				pieces[i][j] = Piece.noPiece();
			}			
		}
	}
	
	public void allNoPieceInitialize() {
		for(int i = 0; i < CHESS_COLUMN ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				pieces[i][j] = Piece.noPiece();
			}			
		}
	}
	
	private void blackInitialize() {
		//WHITE Chess Pieces Rook, Night, Bishop, King, Queen
		pieces[0][0] = Piece.createRook(Color.BLACK);
		pieces[0][1] = Piece.createKnight(Color.BLACK);
		pieces[0][2] = Piece.createBishop(Color.BLACK);
		pieces[0][3] = Piece.createQueen(Color.BLACK);
		pieces[0][4] = Piece.createKing(Color.BLACK);
		pieces[0][5] = Piece.createBishop(Color.BLACK);
		pieces[0][6] = Piece.createKnight(Color.BLACK);
		pieces[0][7] = Piece.createRook(Color.BLACK);
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			pieces[1][i] = Piece.createPawn(Color.BLACK);
		}
	}
	
	public void whiteInitialize() {
		pieces[7][0] = Piece.createRook(Color.WHITE);
		pieces[7][1] = Piece.createKnight(Color.WHITE);
		pieces[7][2] = Piece.createBishop(Color.WHITE);
		pieces[7][3] = Piece.createQueen(Color.WHITE);
		pieces[7][4] = Piece.createKing(Color.WHITE);
		pieces[7][5] = Piece.createBishop(Color.WHITE);
		pieces[7][6] = Piece.createKnight(Color.WHITE);
		pieces[7][7] = Piece.createRook(Color.WHITE);
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			pieces[6][i] = Piece.createPawn(Piece.Color.WHITE);
		}
	}
	
	public String print() {
		StringBuilder buffer = new StringBuilder();
		
		for(int i = 0; i < CHESS_ROW ; i++)
		{
			for(int j = 0; j < CHESS_COLUMN ; j++)
			{
				buffer.append(pieces[i][j].getRepresentation());	
			}
			buffer.append(NEWLINE);
		}
		return buffer.toString();
	}

	
	public int pieceCount() {
		
		return Piece.getCount();
	}
}
