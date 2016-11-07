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
	public void initialize() {
		whiteInitialize();
		blackInitialize();
		noPieceInitialize();	
	}
	
	/**
	 * Initializing the noPiece(blank) at row 2~6 on the Board
	 */
	private void noPieceInitialize() {
		for(int i = 2; i < 6 ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				pieces[i][j] = Piece.createNoPiece();
			}			
		}
	}
	
	/**
	 * Initializing the noPiece(blank) at every row on the Board
	 */
	public void allNoPieceInitialize() {
		for(int i = 0; i < CHESS_COLUMN ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				pieces[i][j] = Piece.createNoPiece();
			}			
		}
	}
	
	/**
	 * Initializing Black Pieces
	 */
	private void blackInitialize() {
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
	
	/**
	 * Initializing White Pieces
	 */
	private void whiteInitialize() {
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
	
	/**
	 * Printing the board state
	 */
	public String print() {
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < CHESS_ROW ; i++)
		{
			for(int j = 0; j < CHESS_COLUMN ; j++)
			{
				buffer.append(pieces[i][j].representation.getRepresentation());	
			}
			buffer.append(NEWLINE);
		}
		return buffer.toString();
	}

	/**
	 * Getting a total score
	 * condition - if there is two or more Pawn it gets 0.5 point
	 * @param color which side
	 * @return total score
	 */
	public double getTotalScore(Color color){
		double total = 0.0;
		int adjust = 0;
		for(int i = 0; i < CHESS_ROW ; i++){
			for(int j = 0; j < CHESS_COLUMN ; j++){
				if(pieces[i][j].color == color)
					total +=gradeScore(pieces[i][j]);
				if(pieces[i][j].getType() == Type.PAWN)
					adjust = findPawn(i, j);
				if(adjust >= 2){
					total -= (0.5 * adjust);	
					adjust = 0;
				}
			}
		}
		return total;
	}
	
	/**
	 * Finding Pawn at the specific column and counting
	 * @param i specific location
	 * @param j specific location
	 * @return number of Pawns
	 */
	private int findPawn(int i, int j){
		int pawnCount=1;
		for(int k=i+1; k<CHESS_COLUMN;k++)
		if(pieces[k][j].getType() == Type.PAWN){
			pawnCount++;
		}
		return pawnCount;
	}
	
	/**
	 * Grading score Pawn gets 1point, KNIGHT 2.5, BISHOP 3, ROOK 5, Queen 9
	 * @param piece
	 * @return
	 */
	private double gradeScore(Piece piece){
		if(piece.type==Type.PAWN){
			return 1;
		}
		else if(piece.type==Type.KNIGHT) return 2.5;
		else if(piece.type==Type.BISHOP) return 3;
		else if(piece.type==Type.ROOK) return 5;
		else if(piece.type==Type.QUEEN) return 9;
		return 0;
	}
	
	public void moveKing(int i, int j, int k, int l) {
		pieces[k][l] = pieces[i][j];
		removePiece(i,j);
	}
	
}
