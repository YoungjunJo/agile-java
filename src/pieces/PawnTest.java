package pieces;

import static pieces.Pawn.WHITE;

import junit.framework.TestCase;

public class PawnTest extends TestCase {

	
	public void testCreate() {
		Pawn firstPawn = new Pawn();
		assertEquals(WHITE, firstPawn.getColor());
	}
}
