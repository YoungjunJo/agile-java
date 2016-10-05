package chess;

import junit.framework.TestCase;

public class PawnTest extends TestCase{

	static final String WHITE = "white";
	static final String BLACK = "black";
	
	public void testCreate(){
		Pawn firstPawn = new Pawn();
		firstPawn.setColor(WHITE);
		assertEquals(WHITE, firstPawn.getColor());
		Pawn secondPawn = new Pawn();
		secondPawn.setColor(BLACK);
		assertEquals(BLACK, secondPawn.getColor());
		
	}
}
