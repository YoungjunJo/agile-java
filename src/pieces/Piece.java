package pieces;

import pieces.Piece.Color;

/**
 * Provides a representation of a Piece
 * @author JYJ
 */

public class Piece {
	public static final int CHESS_ROW = 8 ;
	public static final int CHESS_COLUMN = 8 ;
	final static char PAWN_REPRESENTATION='p';
	final static char ROOK_REPRESENTATION='r';
	final static char KNIGHT_REPRESENTATION='n';
	final static char BISHOP_REPRESENTATION='b';
	final static char QUEEN_REPRESENTATION='q';
	final static char KING_REPRESENTATION='k';
	
	static int count;
	public Type type;
	public Color color;
	public char representation;
	
	private static class WhitePiece extends Piece{
		WhitePiece(Type type, char representation) {
			this.color = Color.WHITE;
			this.type = type;
			this.representation = representation;
		}
		public Type getType(){
			return type;
		}
	}

	private static class BlackPiece extends Piece{
		BlackPiece(Type type, char representation) {
			this.color = Color.BLACK;
			this.type = type;
			this.representation = Character.toUpperCase(representation);
		}
		public Type getType(){
			return type;
		}
	}
	
	static public Piece noPiece(){
		Piece piece = new NoPiece();
		return piece;
	}
	
	
	private static class NoPiece extends Piece{
		NoPiece(){
			this.color = Color.NONE;
			this.type = Type.NO_PIECE;
			this.representation = '.'; 
		}
	}
	
	
	/**
	 * Provides a representation of a Piece's Color
	 */	
	public enum Color{
		WHITE, BLACK, NONE;
	};
	
	public enum Type{
		PAWN, ROOK, KNIGHT,BISHOP, QUEEN, KING, NO_PIECE
	}
	
	public char getRepresentation(){
		return this.representation;
	}
	
	public Type getType(){
		return this.type;
	}

	public Color getColor(){
		return this.color;
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
	
	public boolean isWhite(){
		return this.color == Color.WHITE;
		//question1 how to use enum
	}
	
	public boolean isBlack(){
		return this.color == Color.BLACK;
	}

	/**
	 * Factory method Constructing a Piece having a specific color and name
	 * @param color the Piece has
	 * @param side the Piece has
	 */
	public static Piece createPawn(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.PAWN, PAWN_REPRESENTATION);
		else
			return new BlackPiece(Type.PAWN, PAWN_REPRESENTATION);
	}

	public static Piece createRook(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.ROOK, ROOK_REPRESENTATION);
		else
			return new BlackPiece(Type.ROOK, ROOK_REPRESENTATION);
	}
	
	public static Piece createKnight(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.KNIGHT, KNIGHT_REPRESENTATION);
		else
			return new BlackPiece(Type.KNIGHT, KNIGHT_REPRESENTATION);
	}
	
	public static Piece createBishop(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.BISHOP, BISHOP_REPRESENTATION);
		else
			return new BlackPiece(Type.BISHOP, BISHOP_REPRESENTATION);
	}
	
	public static Piece createQueen(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.QUEEN, QUEEN_REPRESENTATION);
		else
			return new BlackPiece(Type.QUEEN, QUEEN_REPRESENTATION);
	}
	
	public static Piece createKing(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.KING, KING_REPRESENTATION);
		else
			return new BlackPiece(Type.KING, KING_REPRESENTATION);
	}
	
	public void setType(Type type){
		this.type = type; 
	}
	
	public void setColor(Color color){
		this.color = color; 
	}
}