package chess;

import junit.framework.TestCase;
import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class GameTest extends TestCase {

	private Game game;
	
	public void setUp() {
		game = new Game();
	}

	public void testBoardCreate() {
		game.allNoPieceInitialize();
		assertEquals(0, Piece.getCount());
		game.board.addPiece(0,1,Color.BLACK,Type.PAWN);
		game.board.addPiece(1,1,Color.BLACK,Type.PAWN);
		game.board.addPiece(2,1,Color.BLACK,Type.PAWN);
		assertEquals(3, Piece.getCount());
		assertEquals(1.5, game.getTotalScore(Color.BLACK));
		Piece.reSetCount();
		assertEquals(0, Piece.getCount());
	}
	
	public void testKingMove() {
		game.allNoPieceInitialize();
		game.board.addPiece(1, 1, Color.BLACK, Type.KING);
		game.board.movePiece(1, 1, 2, 2);
		game.board.addPiece(0, 3, Color.BLACK, Type.QUEEN);
		game.board.movePiece(0, 3, 3, 6);
		Piece.reSetCount();
		System.out.println(game.print());
	}
}
