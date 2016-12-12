package pieces;

public class Pawn extends Piece {

	public static Pawn create(Color color) {
		return new Pawn(color);	
	}
	
	protected Pawn(Color color) {
		super(color, Representation.PAWN);
	}
	
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(super.move(piece, sourceY, sourceX, destY, destX) == false) {
			return false;
		}
		if(piece.isBlack()) {
			if( (sourceY + 1 == destY) || ((sourceY + 2 == destY) && sourceY == 1))
				return true;
		}
		else {
			if( (sourceY - 1 == destY) || ((sourceY - 2 == destY) && sourceY == 6))
				return true;
		}

		return false;
	}
	
}
