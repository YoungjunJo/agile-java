package chess;

import static pieces.Piece.CHESS_COLUMN;
import static pieces.Piece.CHESS_ROW;
import static util.StringUtil.NEWLINE;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class Game {
	public Board board = new Board();
	
	
	public Board getBoard() {
        return board;
    }
	
	
	/**
	 * Initializing Pieces
	 */
	public void initialize() {
		whiteInitialize();
		blackInitialize();
		noPieceInitialize();	
	}
	
	/**
	 * Initializing the noPiece(blank) at row 2~6 on the Board
	 */
	public void noPieceInitialize() {
		for(int i = 2; i < 6 ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				board.pieces[i][j] = Piece.createNoPiece();
			}			
		}
	}
	
	/**
	 * Initializing the noPiece(blank) at every row on the Board
	 */
	public void allNoPieceInitialize() {
		for(int i = 0; i < CHESS_COLUMN ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				board.pieces[i][j] = Piece.createNoPiece();
			}			
		}
	}
	
	/**
	 * Initializing Black Pieces
	 */
	private void blackInitialize() {
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			board.pieces[1][i] = Piece.createPawn(Color.BLACK);
		}
		board.pieces[0][0] = Piece.createRook(Color.BLACK);
		board.pieces[0][1] = Piece.createKnight(Color.BLACK);
		board.pieces[0][2] = Piece.createBishop(Color.BLACK);
		board.pieces[0][3] = Piece.createQueen(Color.BLACK);
		board.pieces[0][4] = Piece.createKing(Color.BLACK);
		board.pieces[0][5] = Piece.createBishop(Color.BLACK);
		board.pieces[0][6] = Piece.createKnight(Color.BLACK);
		board.pieces[0][7] = Piece.createRook(Color.BLACK);
	}
	
	/**
	 * Initializing White Pieces
	 */
	private void whiteInitialize() {
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			board.pieces[6][i] = Piece.createPawn(Piece.Color.WHITE);
		}
		board.pieces[7][0] = Piece.createRook(Color.WHITE);
		board.pieces[7][1] = Piece.createKnight(Color.WHITE);
		board.pieces[7][2] = Piece.createBishop(Color.WHITE);
		board.pieces[7][3] = Piece.createQueen(Color.WHITE);
		board.pieces[7][4] = Piece.createKing(Color.WHITE);
		board.pieces[7][5] = Piece.createBishop(Color.WHITE);
		board.pieces[7][6] = Piece.createKnight(Color.WHITE);
		board.pieces[7][7] = Piece.createRook(Color.WHITE);

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
				buffer.append(board.pieces[i][j].representation.getRepresentation());	
			}
			buffer.append(NEWLINE);
		}
		return buffer.toString();
	}

	/**
	 * Getting a total score
	 * condition - if there is two or more Pawn it gets 0.5 point, at a column 
	 * @param color which side
	 * @return total score
	 */
	public double getTotalScore(Color color){
		double total = 0.0;
		for(int i = 0; i < CHESS_ROW ; i++){
			for(int j = 0; j < CHESS_COLUMN ; j++){
				if(board.pieces[i][j].color == color)
					total +=gradeScore(board.pieces[i][j]);
				if( (board.pieces[i][j].getType() == Type.PAWN) && (isMorePawn(j)<1) ){
					total += 0.5;
				}
			}
		}
		return total;
	}
	
	/**
	 * Finding Pawn at the column and counting
	 * @param i specific location
	 * @param j specific location
	 * @return number of Pawns
	 */
	private int isMorePawn(int j){
		int count=0;
		for(int k = 0 ; k<CHESS_COLUMN;k++)
		if(board.pieces[k][j].getType() == Type.PAWN){
			count++;
		}
		return count;
	}
	
	/**
	 * Grading score Pawn gets 0.5 point, KNIGHT 2.5, BISHOP 3, ROOK 5, Queen 9
	 * @param piece
	 * @return
	 */
	private double gradeScore(Piece piece){
		if(piece.type==Type.PAWN)return 0.5;
		else if(piece.type==Type.KNIGHT) return 2.5;
		else if(piece.type==Type.BISHOP) return 3;
		else if(piece.type==Type.ROOK) return 5;
		else if(piece.type==Type.QUEEN) return 9;
		return 0;
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
				if((board.pieces[i][j].getType()==type) && (board.pieces[i][j].getColor()==color)){
					board.piecesCount++;
				}
		return board.piecesCount;				
	}
	
	public void moveKing(int i, int j, int k, int l) {
		if(  (k-i)*(k-i) + (j-l)*(j-l) <= 2 ) {
		board.pieces[k][l] = board.pieces[i][j];
		board.removePiece(i,j);
		}
	}
	
}
