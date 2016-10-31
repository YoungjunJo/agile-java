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
	}

	public void testBoardCreate() {
		board.allNoPieceInitialize();
		assertEquals(0, Piece.getCount());
		board.addPiece(0,1,Color.BLACK,Type.PAWN);
		board.addPiece(1,1,Color.BLACK,Type.PAWN);
		board.addPiece(1,0,Color.BLACK,Type.PAWN);
		board.addPiece(3,3,Color.BLACK,Type.PAWN);
		board.addPiece(5,3,Color.BLACK,Type.PAWN);
		board.addPiece(3,7,Color.BLACK,Type.PAWN);
		assertEquals(7, Piece.getCount());
		System.out.println(board.print());
		assertEquals(4.0, board.getScore(Color.BLACK));
	}
}