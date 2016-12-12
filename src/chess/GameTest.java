package chess;

import junit.framework.TestCase;
import pieces.*;
import pieces.Piece.Color;

public class GameTest extends TestCase {

	private Game game;
	
	public void setUp() {
		game = new Game();
	}

	public void testMoveBoardCreate() {
		game.allNoPieceInitialize();
		assertEquals(0, Piece.getCount());
		game.board.pieces[0][0] = King.create(Color.WHITE);
		game.board.pieces[0][2] = Queen.create(Color.BLACK);
		game.board.pieces[0][3] = Knight.create(Color.BLACK);
		game.board.pieces[0][4] = Bishop.create(Color.BLACK);
		game.board.pieces[2][5] = Pawn.create(Color.BLACK);
		game.board.pieces[7][0] = Rook.create(Color.WHITE);
		game.board.movePiece(game.board.getPiece(0, 2), 0, 2, 6, 2);
		//question 파라미터 값이 중복. Piece 개개별로 좌표를 들고 있으면, Piece와 옮겨가고자하는 값 2개만으로 구현 가능?
		game.board.movePiece(game.board.getPiece(0, 3), 0, 3, 3, 2);
		game.board.movePiece(game.board.getPiece(0, 4), 0, 4, 2, 6);
		game.board.movePiece(game.board.getPiece(2, 5), 2, 5, 3, 5);
		game.board.movePiece(game.board.getPiece(7, 0), 7, 0, 3, 0);
		System.out.println(game.print());

	}
	
	public void testInitBoardCreate() {
		game.initialize();
		System.out.println(game.print());
	}

}
