package chess;

import java.util.ArrayList;
import pieces.Pawn;

/**
 * Provides a representation of a Chess Board
 * @author JYJ
 */
public class Board{
	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

	/**
	 * Getting the pawns list
	 * @return pawns the ArrayList
	 */
	public ArrayList<Pawn> getAllPawn(){
		return pawns;
	}

	/**
	 * Adding a Pawn on the ArrayList
	 * @param pawn the Pawn will be added at the ArrayList
	 */
	public void addPawn(Pawn pawn){
		pawns.add(pawn);		
	}

	/**
	 * Getting a number of pawns
	 * @return Returns the number of pawns in this list.
	 */
	int getNumberOfPawns(){
		return pawns.size();
	}
	
	/**
	 * Getting a Pawn's position
	 * @return Returns the pawn at the specified position in this list.
	 */
	Pawn get(int index){
		return pawns.get(index);
	}
	
}
