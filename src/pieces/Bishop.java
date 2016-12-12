package pieces;

public class Bishop extends Piece {

	public static Bishop create(Color color) {
		return new Bishop(color);	
	}
	
	protected Bishop(Color color) {
		super(color, Representation.BISHOP);
	}
	
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(super.move(piece, sourceY, sourceX, destY, destX) == false) {
			return false;
		}
		if( Math.abs(destY - sourceY) == Math.abs(destX - sourceX ) ) {
			return true; 
		}
		return false;
	}
	
}
