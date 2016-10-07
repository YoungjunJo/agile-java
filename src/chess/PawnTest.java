package chess;

import junit.framework.TestCase;

public class PawnTest extends TestCase{
	static final String WHITE = "white";
	static final String BLACK = "black";
	
	public void testCreate(){
		Pawn firstPawn = new Pawn();
		assertEquals(WHITE, firstPawn.getColor());
	}
}
