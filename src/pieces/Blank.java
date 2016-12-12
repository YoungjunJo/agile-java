package pieces;

public class Blank extends Piece{

	public static Blank create(Color color) {
		return new Blank(color);	
	}
	
	protected Blank(Color color) {
		super(color, Representation.BLANK);
	}
	
}
