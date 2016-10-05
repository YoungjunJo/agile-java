package chess;

import junit.framework.TestCase;

public class PawnTest extends TestCase{

	public void testCreate(){
		Pawn firstPawn = new Pawn();
		firstPawn.setColor("white");
		assertEquals("white", firstPawn.getColor());
		Pawn secondPawn = new Pawn();
		secondPawn.setColor("black");
		assertEquals("black", secondPawn.getColor());
		
	}
}
