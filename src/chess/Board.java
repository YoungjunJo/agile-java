package chess;

import java.util.ArrayList;
import pieces.Pawn;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.CHESS_ROW;

/**
 * Provides a representation of a Chess Board
 * @author JYJ
 */
public class Board{
	private ArrayList<ArrayList<Pawn>> pawns = new ArrayList<ArrayList<Pawn>>();

	/**
	 * Adding a Pawn on the ArrayList
	 * @param pawn the Pawn will be added at the ArrayList
	 */
	public void addPawn(ArrayList<Pawn> pawn){
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
	ArrayList<Pawn> get(int index){
		return pawns.get(index);
	}
	
	/**
	 * Setting 8 row on the chess board
	 */
	public void initialize(){
		ArrayList<Pawn> row0 = new ArrayList<Pawn>();
		ArrayList<Pawn> row1 = new ArrayList<Pawn>();
		ArrayList<Pawn> row2 = new ArrayList<Pawn>();
		ArrayList<Pawn> row3 = new ArrayList<Pawn>();
		ArrayList<Pawn> row4 = new ArrayList<Pawn>();
		ArrayList<Pawn> row5 = new ArrayList<Pawn>();
		ArrayList<Pawn> row6 = new ArrayList<Pawn>();
		ArrayList<Pawn> row7 = new ArrayList<Pawn>();
		
		setBlankPawn(row0);
		addStartingWhitePawn(row1);
		setBlankPawn(row2);
		setBlankPawn(row3);
		setBlankPawn(row4);
		setBlankPawn(row5);
		addStartingBlackPawn(row6);
		setBlankPawn(row7);
	}

	/**
	 * Adding White 8 Pawns on the ArrayList
	 * @param ArrayList specific row
	 */
	void addStartingWhitePawn(ArrayList<Pawn> row){
		for(int i=0; i<CHESS_ROW; i++)
		{
			row.add(new Pawn());
		}
		pawns.add(row);
	}
	
	/**
	 * Adding Black 8 Pawns on the ArrayList
	 * @param ArrayList specific row
	 */
	void addStartingBlackPawn(ArrayList<Pawn> row){
		for(int i=0; i<CHESS_ROW; i++)
		{
			row.add(new Pawn(BLACK));
		}
		pawns.add(row);
	}
	
	/**
	 * Adding Blank(='.') 8 Pawns on the ArrayList
	 * @param ArrayList specific row
	 */
	void setBlankPawn(ArrayList<Pawn> row){
		for(int i=0; i<CHESS_ROW; i++)
		{
			row.add(new Pawn('.'));
		}
		pawns.add(row);
	}
	

}
