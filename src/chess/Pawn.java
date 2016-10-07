package chess;

import static chess.PawnTest.WHITE;

public class Pawn{
	String color;
	
	public Pawn(){
		color=WHITE;
		}

	public Pawn(String color){
		this.color=color;
	}
	
	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}
	
}