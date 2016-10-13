package chess;

import junit.framework.TestCase;
import static pieces.Pawn.CHESS_ROW;
import static util.StringUtil.NEWLINE;

public class BoardTest extends TestCase {
	private Board board;	
	public void setUp() {
		board = new Board();
	}

	public void testCreate() {
		board.initialize();
		String printChess = printChess();
		assertEquals("........"+ NEWLINE + 
				"pppppppp"+ NEWLINE + 
				"........"+ NEWLINE + 
				"........"+ NEWLINE + 
				"........"+ NEWLINE + 
				"........"+ NEWLINE + 
				"PPPPPPPP"+ NEWLINE + 
				"........"+ NEWLINE, printChess);
		
		System.out.println(printChess);
	}

	private String printChess() {
		StringBuilder buffer = new StringBuilder();
		
		for(int i = 0; i < CHESS_ROW ; i++)
		{
			for(int j = 0; j < CHESS_ROW ; j++)
			{
				buffer.append(board.pawns[i][j].name);	
			}
			buffer.append(NEWLINE);
		}
		return buffer.toString();
	}

		
}

