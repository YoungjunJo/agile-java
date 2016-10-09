package chess;

import junit.framework.TestCase;
import pieces.Pawn;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.WHITE;

public class BoardTest extends junit.framework.TestCase{
	private Board board = new Board();	
	public void testCreate(){
		Pawn firstPawn = new Pawn();
		board.addPawn(firstPawn);
		assertEquals(WHITE, firstPawn.getColor());
		assertEquals(1, board.getNumberOfPawns());
		assertEquals(firstPawn, board.get(0));
		//보드에 놓여져 있는 말의 목록 1번 확인 
		System.out.println(board.get(0));
		
		Pawn secondPawn = new Pawn(BLACK);
		board.addPawn(secondPawn);
		assertEquals(BLACK, secondPawn.getColor());
		assertEquals(2, board.getNumberOfPawns());
		//보드에 놓여져 있는 말의 목록 2번 확인 
		System.out.println(board.get(1));	
		
	}
}
