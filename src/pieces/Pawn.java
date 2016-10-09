package pieces;

/**
 * Provides a representation of a Pawn
 * @author JYJ
 */

public class Pawn{
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	
	String color;
	
	/**
	 * Constructs a Pawn and set the color WHITE
	 */
	public Pawn(){
		color=WHITE;
		}
	
	/**
	 * Constructs a Pawn having a specific color
	 * @param color the Pawn has
	 */
	public Pawn(String color){
		this.color=color;
	}
	
	/**
	 * Getting a pawn's color 
	 * @return color the Pawn has
	 */
	public String getColor(){
		return color;
	}

	/**
	 * Setting a pawn's color
	 * @param color the Pawn has
	 */
	public void setColor(String color){
		this.color = color;
	}
	
}