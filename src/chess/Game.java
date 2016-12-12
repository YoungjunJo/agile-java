package chess;

import static util.StringUtil.CHESS_COLUMN;
import static util.StringUtil.CHESS_ROW;
import static util.StringUtil.NEWLINE;

import pieces.*;
import pieces.Piece.Color;

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
				board.pieces[i][j] = Blank.create(Color.NONE);
			}			
		}
	}
	/**
	 * Initializing the noPiece(blank) at every row on the Board
	 */
	public void allNoPieceInitialize() {
		for(int i = 0; i < CHESS_COLUMN ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				Piece p = Blank.create(Color.NONE);
				board.pieces[i][j] = p;
			}			
		}
	}
	
	/**
	 * Initializing Black Pieces
	 */
	private void blackInitialize() {
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			board.pieces[1][i] = Pawn.create(Color.BLACK);
		}
		board.pieces[0][0] = Rook.create(Color.BLACK);
		board.pieces[0][1] = Knight.create(Color.BLACK);
		board.pieces[0][2] = Bishop.create(Color.BLACK);
		board.pieces[0][3] = Queen.create(Color.BLACK);
		board.pieces[0][4] = King.create(Color.BLACK);
		board.pieces[0][5] = Bishop.create(Color.BLACK);
		board.pieces[0][6] = Knight.create(Color.BLACK);
		board.pieces[0][7] = Rook.create(Color.BLACK);
	}
	/**
	 * Initializing White Pieces
	 */
	private void whiteInitialize() {
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			board.pieces[6][i] = Pawn.create(Piece.Color.WHITE);
		}
		board.pieces[7][0] = Rook.create(Color.WHITE);
		board.pieces[7][1] = Knight.create(Color.WHITE);
		board.pieces[7][2] = Bishop.create(Color.WHITE);
		board.pieces[7][3] = Queen.create(Color.WHITE);
		board.pieces[7][4] = King.create(Color.WHITE);
		board.pieces[7][5] = Bishop.create(Color.WHITE);
		board.pieces[7][6] = Knight.create(Color.WHITE);
		board.pieces[7][7] = Rook.create(Color.WHITE);

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
				if(board.pieces[i][j].getColor()==Color.BLACK) {
					buffer.append( Character.toUpperCase(board.pieces[i][j].representation.getRepresentation()));
				}
					
				else {
					buffer.append(board.pieces[i][j].representation.getRepresentation());
				}
						
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
				if( (board.pieces[i][j].getClass() == Pawn.class) && (isMorePawn(j)<1) ){
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
		if(board.pieces[k][j].getClass() == Pawn.class){
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
		if(piece.getClass() == Pawn.class)return 0.5;
		else if(piece.getClass() == Knight.class) return 2.5;
		else if(piece.getClass() == Bishop.class) return 3;
		else if(piece.getClass() == Rook.class) return 5;
		else if(piece.getClass() == Queen.class) return 9;
		return 0;
	}
	
	/**
	 * Getting a number of a specific Pieces
	 * @param color WHITE or BLACK
	 * @param type  PAWN/ROOK/KINGHT/BISHOP/QUEEN/KING
	 * @return Returns the number of a specific Pieces on the Board
	 */
	public int getNumberOfSpecificPiece(Color color, Piece piece) {

		for(int i = 0 ; i < CHESS_COLUMN ; i++)
			for(int j = 0 ; j < CHESS_COLUMN ; j++)
				if((board.pieces[i][j].getClass() == piece.getClass()) && (board.pieces[i][j].getColor()==color)){
					board.piecesCount++;
				}
		return board.piecesCount;				
	}

	
}
