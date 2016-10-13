package chess;

import java.util.ArrayList;
import pieces.Pawn;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.CHESS_ROW;

/**
 * Provides a representation of a Chess Board
 * @author JYJ
 */
public class Board {
	Pawn[][] pawns =new Pawn[8][8];
	
	/**
	 * Adding a Pawn on the ArrayList
	 * @param pawn the Pawn will be added at the ArrayList
	 */
	private void addPawn(Pawn pawn, int i, int j) {
		pawns[i][j] = new Pawn();		
	}
	
	/**
	 * Getting a number of pawns
	 * @return Returns the number of pawns in this list.
	 */
	private int getNumberOfPawns() {
		return pawns.length;
	}
	
	/**
	 * Getting a Pawn's position
	 * @return Returns the pawn at the specified position in this list.
	 */
	public Pawn get(int index) {
		return pawns[index][0];
	}
	
	/**
	 * Setting 8 row on the chess board
	 */
	public void initialize() {
		
		for(int i = 0; i < CHESS_ROW ; i++){
			for(int j = 0 ; j < CHESS_ROW ; j++){
				pawns[i][j] = new Pawn('.');	
			}			
		}
		
		for(int i = 0 ; i< CHESS_ROW ; i++){
			pawns[1][i] = new Pawn();
		}
		
		for(int i = 0 ; i< CHESS_ROW ; i++){
			pawns[6][i] = new Pawn(BLACK);
		}
		
	}
	

}
