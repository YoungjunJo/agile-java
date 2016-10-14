package chess;

import java.util.ArrayList;
import pieces.Piece;
import static pieces.Piece.BLACK;
import static pieces.Piece.WHITE;
import static pieces.Piece.CHESS_ROW;

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
		
		for(int i = 0; i < CHESS_ROW ; i++){
			
			for(int j = 0 ; j < CHESS_ROW ; j++){
				pieces[i][j] = Piece.create("none", ".");
			}			
		}
		for(int i = 0 ; i< CHESS_ROW ; i++){
			pieces[1][i].setColor(WHITE);
			pieces[1][i].setName("p");
		}
		for(int i = 0 ; i< CHESS_ROW ; i++){
			pieces[6][i].setColor(BLACK);
			pieces[6][i].setName("P");
		}
	}
}
