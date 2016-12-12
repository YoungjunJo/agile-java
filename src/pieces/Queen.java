package pieces;

public class Queen extends Piece {
	public static Queen create(Color color) {
		return new Queen(color);	
	}
	
	protected Queen(Color color) {
		super(color, Representation.QUEEN);
	}
	
	public boolean move(Piece piece, int sourceY, int sourceX, int destY, int destX) {
		if(super.move(piece, sourceY, sourceX, destY, destX) == false) {
			return false;
		}
		if(sourceY - destY == sourceX - destX) {
			return true; 
		}
		if(sourceY == destY) { 
			return true; 
		}
		if(sourceX == destX) { 
			return true; 
		}
		return false;
	}
}
