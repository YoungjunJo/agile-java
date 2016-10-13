package pieces;

/**
 * Provides a representation of a Pawn
 * @author JYJ
 */

public class Pawn {
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	public static final int CHESS_ROW = 8 ;
	public static final int CHESS_COLUMN = 8 ;
	
	private String color;
	public char name;
	
	/**
	 * Constructs a Pawn
	 * Setting the color WHITE and Name 'p'(Lower) means White side
	 */
	public Pawn() {
		color = WHITE;
		this.name = 'p';
		}
	
	/**
	 * Constructs a Pawn having a specific color
	 * Setting the Name 'P'(Upper) means Black side
	 * @param color the Pawn has
	 */
	public Pawn(String color) {
		this.color = color;
		this.name = 'P';
	}
	
	/**
	 * Constructs a Pawn having a specific color and name
	 * @param color the Pawn has
	 * @param side the Pawn has
	 */
	public Pawn(String color, char name) {
		this.color = color;
		this.name = name;
	}
	
	/**
	 * Constructs a Pawn having a specific name
	 * @param name the Pawn has
	 */
	public Pawn(char name) {
		this.name = name;
	}
	
	/**
	 * Getting a pawn's color 
	 * @return color the Pawn has
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setting a pawn's color
	 * @param color the Pawn has
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Getting a pawn's name
	 * @return side the Pawn has
	 */
	public char getName() {
		return name;
	}
	
	/**
	 * Setting a pawn's name
	 * @param side the Pawn has
	 */
	public void setName(char name) {
		this.name = name;
	}
	
}