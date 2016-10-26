package chess;

import java.util.ArrayList;
import pieces.Piece;

import static util.StringUtil.NEWLINE;
import static pieces.Piece.CHESS_ROW;
import static pieces.Piece.CHESS_COLUMN;
/**
 * Provides a representation of a Chess Board
 * @author JYJ
 */
public class Board {
	Piece[][] pieces =new Piece[8][8];
	
	/**
	 * Adding a Pawn on the ArrayList
	 * @param pawn the Pawn will be added at the ArrayList
	 */
	private void addPawn(int i, int j, String color, String name) {
		pieces[i][j].setColor(color);
		pieces[i][j].setName(name);
	}
	
	/**
	 * Getting a number of pawns
	 * @return Returns the number of pawns in this list.
	 */
	private int getNumberOfPawns() {
		return pieces.length;
	}
	
	/**
	 * Getting a pieces first position
	 * @return Returns the pieces at the specified position in this list.
	 */
	public Piece get(int i, int j) {
		return pieces[i][j];
	}
	
	/**
	 * Setting 8 row on the chess board
	 */
	public void initialize() {
		whiteInitialize();
		blackInitialize();
		
		for(int i = 2; i < 6 ; i++){
			for(int j = 0 ; j < CHESS_COLUMN ; j++){
				//Piece.Color color;
				pieces[i][j] = Piece.create(Piece.Color.NONE, ".");
			}			
		}
	}
	public void whiteInitialize() {
		//WHITE Chess Pieces Rook, Night, Bishop, King, Queen
		pieces[0][0] = Piece.create(Piece.Color.WHITE, "R");
		pieces[0][1] = Piece.create(Piece.Color.WHITE, "N");
		pieces[0][2] = Piece.create(Piece.Color.WHITE, "B");
		pieces[0][3] = Piece.create(Piece.Color.WHITE, "Q");
		pieces[0][4] = Piece.create(Piece.Color.WHITE, "K");
		pieces[0][5] = Piece.create(Piece.Color.WHITE, "B");
		pieces[0][6] = Piece.create(Piece.Color.WHITE, "N");
		pieces[0][7] = Piece.create(Piece.Color.WHITE, "R");
		
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			pieces[1][i] = Piece.create(Piece.Color.WHITE, "P");
		}
	}
	
	public void blackInitialize() {
		pieces[7][0] = Piece.create(Piece.Color.BLACK, "r");
		pieces[7][1] = Piece.create(Piece.Color.BLACK, "n");
		pieces[7][2] = Piece.create(Piece.Color.BLACK, "b");
		pieces[7][3] = Piece.create(Piece.Color.BLACK, "q");
		pieces[7][4] = Piece.create(Piece.Color.BLACK, "k");
		pieces[7][5] = Piece.create(Piece.Color.BLACK, "b");
		pieces[7][6] = Piece.create(Piece.Color.BLACK, "n");
		pieces[7][7] = Piece.create(Piece.Color.BLACK, "r");
		for(int i = 0 ; i< CHESS_COLUMN ; i++){
			pieces[6][i] = Piece.create(Piece.Color.BLACK, "p");
		}
	}
	
	public String print() {
		StringBuilder buffer = new StringBuilder();
		
		for(int i = 0; i < CHESS_ROW ; i++)
		{
			for(int j = 0; j < CHESS_COLUMN ; j++)
			{
				buffer.append(pieces[i][j].getName());	
			}
			buffer.append(NEWLINE);
		}
		return buffer.toString();
	}

	
	public int pieceCount() {
		
		return Piece.getCount();
	}
}
