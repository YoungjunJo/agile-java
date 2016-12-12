package pieces;

import java.util.EnumMap;
import java.util.Map;

/**
 * Provides a representation of a Piece
 * @author JYJ
 */
public class Piece {

	final static double PAWN_SCORE=1.0;
	final static double KNIGHT_SCORE=2.5;
	final static double BISHOP_SCORE=3.0;
	final static double ROOK_SCORE=5.0;
	final static double QUEEN_SCORE=9.0;
	final static double KING_SCORE=0.0;
	
	static int count;
	//public Type type;
	public Color color;
	public Representation representation;
	public double score; 
	
	
	public Piece(Color color, Representation representation) {
		this.color = color;
		this.representation = representation;

	}

	/*
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
	*/
	public enum Representation {
		PAWN('p'), ROOK('r'), KNIGHT('n')
		, BISHOP('b'), QUEEN('q')
		, KING('k'), BLANK('.');
		
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
	/*
	public enum Type{
		PAWN, ROOK, KNIGHT,BISHOP, QUEEN, KING, NO_PIECE
	}
	*/
	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}
	
 //Question factory method 가 가능한가? Piece로 타입을 구분해야하는데, 타입이 이넘이 없음.
	// 각 말에 대해 create 함수를 만들면 이게 팩토리 메소드 인가?, 
/*	
	public static Piece create(Piece piece, Color color){
		incrementCount();
		if(piece.getClass()==King.class) {
			return King.create(color);
		}
			
		else if(piece.getClass() == Queen.class){
			return Queen.create(color);
		}
		
		else if(piece.getClass() == Blank.class) {
			return Blank.create(color);
		}
		return piece;
	}
	
*/
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX){
        if(sourceX == destX && sourceY == destY) {
            return false; //cannot move nothing
        }
        if(sourceY < 0 || sourceY > 7 || sourceX < 0 || sourceX > 7 || destY < 0 || destY > 7 || destX <0 || destX > 7) {
            return false; //out of board
        }
		return true;
		
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
	
	public void setColor(Color color){
		this.color = color; 
	}



}
