package pieces;

public class Rook extends Piece {

	public static Rook create(Color color) {
		return new Rook(color);	
	}
	
	protected Rook(Color color) {
		super(color, Representation.ROOK);
	}
	
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(super.move(piece, sourceY, sourceX, destY, destX) == false) {
			return false;
		}
		if( destY == sourceY || destX == sourceX ) {
			return true; 
		}
		return false;
	}
	
}
