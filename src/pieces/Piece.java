package pieces;

import java.util.EnumMap;
import java.util.Map;

/**
 * Provides a representation of a Piece
 * @author JYJ
 */
public class Piece {
	public static final int CHESS_ROW = 8 ;
	public static final int CHESS_COLUMN = 8 ;
	
	final static double PAWN_SCORE=1.0;
	final static double KNIGHT_SCORE=2.5;
	final static double BISHOP_SCORE=3.0;
	final static double ROOK_SCORE=5.0;
	final static double QUEEN_SCORE=9.0;
	final static double KING_SCORE=0.0;
	
	static int count;
	public Type type;
	public Color color;
	public Representation representation;
	public double score; 
	
	private Map<Type, Double> scores = null;
	
	public double getMessage(Piece.Type type) {
		return getMessages().get(type);
	}
	
	private Map<Type, Double> getMessages() {
		if (scores==null)
			loadScores();
		return scores;
	}
	
	private void loadScores() {
		scores = new EnumMap<Type, Double> (Type.class);
		scores.put(Type.PAWN, 1.0);
		scores.put(Type.KNIGHT, 2.5);
		scores.put(Type.BISHOP, 3.0);
		scores.put(Type.ROOK, 5.0);
		scores.put(Type.QUEEN, 9.0);
	}
	
	public enum Representation {
		PAWN('p'), ROOK('r'), KNIGHT('n')
		, BISHOP('b'), QUEEN('q')
		, KING('k'), NO_PIECE('.');
		
		private char character;
		Representation(char character) {
			this.character = character;
		}

		public char getRepresentation() {
			return this.character;
		}

	}
	/**
	 * Provides a representation of a Piece's Color
	 */	
	public enum Color{
		WHITE, BLACK, NONE;
	};
	
	/**
	 * Provides a representation of a Piece's Type
	 */	
	public enum Type{
		PAWN, ROOK, KNIGHT,BISHOP, QUEEN, KING, NO_PIECE
	}
	
	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}
	
	/**
	 * Class White Piece
	 * basically set the color as WHITE
	 */
	private static class WhitePiece extends Piece{
		WhitePiece(Type type, Representation representation) {
			this.color = Color.WHITE;
			this.type = type;
			this.representation = representation;
			switch(type) {
			case PAWN: setScore(PAWN_SCORE);
				break;
			case KNIGHT: setScore(KNIGHT_SCORE);
				break;
			case BISHOP: setScore(BISHOP_SCORE);
				break;
			case ROOK: setScore(ROOK_SCORE);
				break;
			case QUEEN: setScore(QUEEN_SCORE);
				break;
			default:
				break;		
			}
		}
		public Type getType(){
			return type;
		}
	}

	/**
	 * Class Black Piece
	 * basically set the color as BLACK
	 */
	private static class BlackPiece extends Piece{
		BlackPiece(Type type, Representation representation) {
			this.color = Color.BLACK;
			this.type = type;
			this.representation = representation;
			//question 
			this.representation.character = Character.toUpperCase(this.representation.getRepresentation());
			switch(type) {
			case PAWN: setScore(PAWN_SCORE);
				break;
			case KNIGHT: setScore(KNIGHT_SCORE);
				break;
			case BISHOP: setScore(BISHOP_SCORE);
				break;
			case ROOK: setScore(ROOK_SCORE);
				break;
			case QUEEN: setScore(QUEEN_SCORE);
				break;
			default:
				break;		
			}
		}
		public Type getType(){
			return type;
		}
	}
	
	/**
	 * Class NOPiece
	 * basically set the representation as '.'
	 */
	private static class NoPiece extends Piece{
		NoPiece(){
			this.color = Color.NONE;
			this.type = Type.NO_PIECE;
			this.representation = Representation.NO_PIECE; 
		}
	}
	
	/**
	 * Factory method Constructing a Piece having a specific color and name
	 * @param color the Piece has
	 * @param side the Piece has
	 */
	public static Piece createPawn(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.PAWN, Representation.PAWN);
		else
			return new BlackPiece(Type.PAWN, Representation.PAWN);
	}

	public static Piece createRook(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.ROOK, Representation.ROOK);
		else
			return new BlackPiece(Type.ROOK, Representation.ROOK);
	}
	
	public static Piece createKnight(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.KNIGHT, Representation.KNIGHT);
		else
			return new BlackPiece(Type.KNIGHT, Representation.KNIGHT);
	}
	
	public static Piece createBishop(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.BISHOP, Representation.BISHOP);
		else
			return new BlackPiece(Type.BISHOP, Representation.BISHOP);
	}
	
	public static Piece createQueen(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.QUEEN, Representation.QUEEN);
		else
			return new BlackPiece(Type.QUEEN, Representation.QUEEN);
	}
	
	public static Piece createKing(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.KING, Representation.KING);
		else
			return new BlackPiece(Type.KING, Representation.KING);
	}
	
	public static Piece createKing2(Color color){
		incrementCount();
		if(color==Color.WHITE)
			return new WhitePiece(Type.KING, Representation.KING);
		else
			return new BlackPiece(Type.KING, Representation.KING);
	}
	
    public boolean getPossibleMoves( int sourceY, int sourceX, int destY, int destX){
        if(sourceX == destX && sourceY == destY)
            return false; //cannot move nothing
        if(sourceY < 0 || sourceY > 7 || sourceX < 0 || sourceX > 7 || destY < 0 || destY > 7 || destX <0 || destX > 7)
            return false; //out of board
        return true;
    }
	
	
	/**
	 * Factory method constructing NoPiece
	 * @return
	 */
	static public Piece createNoPiece(){
		Piece piece = new NoPiece();
		return piece;
	}

	
	/**
	 * Getting a type
	 * @return Piece's type
	 */
	public Type getType(){
		return this.type;
	}

	/**
	 * Getting a color
	 * @return Piece's color
	 */
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
	
	public static void reSetCount() {
		count=0;
	}
	
	/**
	 * Incrementing a Piece's count
	 */
	private static void incrementCount() {
		++count;
	}
	
	/**
	 * Checking a Piece's color
	 * @return 
	 */
	public boolean isWhite(){
		return this.color == Color.WHITE;
	}
	
	/**
	 * Checking a Piece's color
	 * @return
	 */
	public boolean isBlack(){
		return this.color == Color.BLACK;
	}

	public void setType(Type type){
		this.type = type; 
	}
	
	public void setColor(Color color){
		this.color = color; 
	}



}
