package pieces;

public class King extends Piece {
	
	public static King create(Color color) {
		return new King(color);	
	}
	
	protected King(Color color) {
		super(color, Representation.KING);
	}
	
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(super.move(piece, sourceY, sourceX, destY, destX) == false) {
			return false;
		}
		if( (destY - sourceY) * (destY-sourceY) + (sourceX-destX) * (sourceX-destX) <= 2 ) {
			return true; 
		}
		return false;
	}
}
