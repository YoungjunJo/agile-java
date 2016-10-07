package chess;

import java.util.ArrayList;
import pieces.Pawn;

public class Board{
		//String [][]chessBoard= new String[8][8]; 
	
	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	
	
	public ArrayList<Pawn> getAllPawn(){
		return pawns;
	}
	
	public void addPawn(Pawn pawn){
		pawns.add(pawn);
		
	}
	
	int getNumberOfPawns(){
		return pawns.size();
	}
	
	
}
