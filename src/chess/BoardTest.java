package chess;

import junit.framework.TestCase;
import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import chess.Board;

public class BoardTest extends TestCase {
	private Board board;	
	public void setUp() {
		board = new Board();
		//System.out.println("this is Setup()");
	}

	public void testBoardCreate() {
		board.allNoPieceInitialize();
		assertEquals(0, Piece.getCount());
		board.addPiece(0,0,Color.WHITE,Type.PAWN);
		assertEquals(1, Piece.getCount());
		assertEquals(1, board.getNumberOfPiece(Color.WHITE, Type.PAWN));
		board.addPiece(2,2,Color.BLACK,Type.KING);
		assertEquals(2, Piece.getCount());
		System.out.println(board.print());
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

	
}