package pieces;

import junit.framework.TestCase;
import pieces.Piece;

import pieces.Piece.Color;



public class PieceTest extends TestCase {

	public void testPieceCreate() {
		Piece k = King.create(Color.WHITE);
		Class<King> expectedClass = King.class;
		assertEquals(expectedClass, k.getClass());
	}

}

