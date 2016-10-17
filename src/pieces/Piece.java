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
	static int count;
	
	/**
	 * Constructs a Piece having a specific color and name
	 * @param color the Piece has
	 * @param side the Piece has
	 */
	private Piece(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	/**
	 * Factory method Constructing a Piece having a specific color and name
	 * @param color the Piece has
	 * @param side the Piece has
	 */
	public static Piece create(String color, String name) {
		if(color == WHITE || color == BLACK)
		incrementCount();
		return new Piece(color, name);
	}
	/**
	 * Getting a Piece color 
	 * @return color the Pawn has
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setting a Piece's color
	 * @param color the Piece has
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Getting a Piece's name
	 * @return side the Piece has
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setting a Piece's name
	 * @param name the Piece has
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getting a Piece's count
	 * @return count
	 */
	public static int getCount() {
		return count;
	}
	
	/**
	 * increment a Piece's count
	 */
	private static void incrementCount() {
		++count;
	}
	
	public boolean isWhite(Piece piece){
		return piece.color == WHITE;
	}
	
	public boolean isBlack(Piece piece){
		return piece.color == BLACK;
	}
	
}