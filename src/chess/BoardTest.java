package chess;

import junit.framework.TestCase;
import pieces.Pawn;
import static pieces.Pawn.BLACK;
import static pieces.Pawn.WHITE;

public class BoardTest extends junit.framework.TestCase{
	private Board board;
	static final String NEWLINE = 
			System.getProperty("line.separator");
	
	public void setUp(){
		board = new Board();
	}
	
	public void testCreate(){
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
	
	String printChess(){
		StringBuilder buffer = new StringBuilder();
		
		for(int i=0; i<8 ; i++)
		{
			for(int j=0; j<8 ; j++)
			{
				buffer.append(board.get(i).get(j).getName());	
			}
			buffer.append(NEWLINE);
		}
		return buffer.toString();
	}
		
}

