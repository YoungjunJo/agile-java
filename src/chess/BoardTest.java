package chess;

import junit.framework.TestCase;
import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

import chess.Board;

public class BoardTest extends TestCase {
	private Board board;
	// question - Collection 이라는건 list, map, set형태인데 현재는 [][] 2차배열
	// Comparable 인터페이스를 사용하려 했으나 
	// Piece[8][8]를 가진 board에서 comapreTo(Board that)으로는 [i][j] 값을 오버라이딩 하기 어려움 시그니처가 다름 . 
	// 다른 방법으로 별도의 List를 만드는것도 생각했으나
	//List의 set(), get(), Board.Piece[][]형을 List 형으로 변환 하는 과정상에 구조가 복잡해짐.   
	
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
		assertEquals(6, Piece.getCount());
		System.out.println(board.print());
		assertEquals(4.0, board.getTotalScore(Color.BLACK));
	}

}