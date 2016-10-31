package chess;

import junit.framework.TestCase;
import pieces.Piece;
import pieces.Piece.Color;
import chess.Board;

public class BoardTest extends TestCase {
	private Board board;	
	public void setUp() {
		board = new Board();
		//System.out.println("this is Setup()");
	}

	public void testBoardCreate() {
		testClearBoard();
		board.pieces[0][0] = Piece.createPawn(Color.WHITE);
		/*
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
		assertEquals("ROOK", board.getPiece(0,0).getType().toString());
	*/
	}
	public void testClearBoard(){
		assertEquals(0, Piece.getCount());
	}
	
}