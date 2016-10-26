package pieces;

import pieces.Piece.Color;

/**
 * Provides a representation of a Piece
 * @author JYJ
 */

public class Piece {
//	public static final String WHITE = "WHITE";
	//public static final String BLACK = "BLACK";
	public static final int CHESS_ROW = 8 ;
	public static final int CHESS_COLUMN = 8 ;
	
	private String color;
	private String name;
	static int count;

	/**
	 * Provides a representation of a Piece's Color
	 */	
	public enum Color{
		WHITE("white"), BLACK("black"), NONE("none");
		//""없이 선언하면 상수가 되는데, 상수로 사용하면 안되나?;
		public String color;
		Color(String color){
			this.color=color;
		}
		String getColor(){
			return this.color;
		}
		
	};
	
	public enum Type{
		PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
	}
	
	
	/**
	 * Constructs a Piece having a specific color and name
	 * @param color the Piece has
	 * @param side the Piece has
	 */
	private Piece(Color color, String name) {
		this.color = color.getColor();
		this.name = name;
	}
	
	/**
	 * Factory method Constructing a Piece having a specific color and name
	 * @param color the Piece has
	 * @param side the Piece has
	 */
	public static Piece create(Color color, String name) {
		if(color == Color.WHITE || color == Color.BLACK){
			incrementCount();
			System.out.println(color.getColor());
			System.out.println(name);
		}
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
		return piece.color == "white";
		//question1 how to use enum
	}
	
	public boolean isBlack(Piece piece){
		return piece.color == "black";
	}

	
}