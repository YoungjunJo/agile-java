package chess;

import junit.framework.TestCase;

import static chess.Pawn.WHITE;
import static chess.Pawn.BLACK;

public class PawnTest extends TestCase{

	
	public void testCreate(){
		Pawn firstPawn = new Pawn();
		assertEquals(WHITE, firstPawn.getColor());
	}
}
