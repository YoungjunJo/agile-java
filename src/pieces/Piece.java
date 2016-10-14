package pieces;

/**
 * Provides a representation of a Pawn
 * @author JYJ
 */

public class Piece {
	public static final String WHITE = "WHITE";
	public static final String BLACK = "BLACK";
	public static final int CHESS_ROW = 8 ;
	public static final int CHESS_COLUMN = 8 ;
	
	private String color;
	private String name;
	
	/**
	 * Constructs a Pawn having a specific color and name
	 * @param color the Pawn has
	 * @param side the Pawn has
	 */
	private Piece(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	/**
	 * Factory method Constructing a Pawn having a specific color and name
	 * @param color the Pawn has
	 * @param side the Pawn has
	 */
	public static Piece create(String color, String name) {
		return new Piece(color, name);
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
	public String getName() {
		return name;
	}
	
	/**
	 * Setting a pawn's name
	 * @param side the Pawn has
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}