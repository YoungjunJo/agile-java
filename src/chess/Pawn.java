package chess;

public class Pawn{
	static final String WHITE = "white";
	static final String BLACK = "black";
	
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