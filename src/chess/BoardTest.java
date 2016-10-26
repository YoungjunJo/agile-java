package chess;

import junit.framework.TestCase;
import pieces.Piece.Color;
import pieces.Piece.Type;
import util.StringUtil;
import chess.Board;

public class BoardTest extends TestCase {
	private Board board;	
	public void setUp() {
		board = new Board();
	}

	public void testBoardCreate() {
		board.initialize();
		assertEquals(32, board.pieceCount());
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(
			StringUtil.appendNewLine("RNBQKBNR") +
			StringUtil.appendNewLine("PPPPPPPP") + 
			blankRank + blankRank + blankRank + blankRank +
			StringUtil.appendNewLine("pppppppp") +
			StringUtil.appendNewLine("rnbqkbnr"),
			board.print());
		
		assertEquals(8, board.getNumberOfPiece(Color.BLACK, Type.PAWN));
	}	
}