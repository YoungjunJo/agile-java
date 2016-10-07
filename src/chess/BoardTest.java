package chess;

import java.util.ArrayList;
import junit.framework.TestCase;
import pieces.Pawn;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.WHITE;


public class BoardTest extends junit.framework.TestCase{
	private Board board;
	
	public void testCreate(){
		Pawn firstPawn = new Pawn();
		assertEquals(WHITE, firstPawn.getColor());
		Pawn secondPawn = new Pawn(BLACK);
		assertEquals(BLACK, secondPawn.getColor());
		
		board.addPawn(firstPawn);
		board.addPawn(secondPawn);
		assertEquals(2, board.getNumberOfPawns());
		
	}

}
