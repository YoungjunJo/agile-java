package pieces;

public class Knight extends Piece {

	public static Knight create(Color color) {
		return new Knight(color);	
	}
	
	protected Knight(Color color) {
		super(color, Representation.KNIGHT);
	}
	
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(super.move(piece, sourceY, sourceX, destY, destX) == false) {
			return false;
		}
        if((Math.abs(sourceX - destX) == 1 && Math.abs(sourceY - destY) == 2)) {
            return true;
        }
        if((Math.abs(sourceX - destX) == 2 && Math.abs(sourceY - destY) == 1)) {
            return true;
        }
        return false;
	}
	
}
