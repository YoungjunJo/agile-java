package chess;

import junit.framework.TestCase;
import pieces.Pawn;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.WHITE;

public class BoardTest extends junit.framework.TestCase{
	private Board board = new Board();	
	public void testCreate(){
		Pawn firstPawn = new Pawn();
		assertEquals(WHITE, firstPawn.getColor());
		Pawn secondPawn = new Pawn(BLACK);
		assertEquals(BLACK, secondPawn.getColor());
		
		//체스판에 말이 없는 상태 확인 
		assertEquals(0, board.getNumberOfPawns());
		
		board.addPawn(firstPawn);
		board.addPawn(secondPawn);
		assertEquals(2, board.getNumberOfPawns());
		
	}
}
