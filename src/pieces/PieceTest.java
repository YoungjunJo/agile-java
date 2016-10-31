package pieces;

import junit.framework.TestCase;
import pieces.Piece;

import pieces.Piece.Color;


public class PieceTest extends TestCase {
	public void testPieceCreate() {
		verifyCreation(
				Piece.createPawn(Color.WHITE), Piece.createPawn(Color.BLACK),
				Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);
		verifyCreation(
				Piece.createRook(Color.WHITE), Piece.createRook(Color.BLACK),
				Piece.Type.ROOK, Piece.ROOK_REPRESENTATION);
		verifyCreation(
				Piece.createKnight(Color.WHITE), Piece.createKnight(Color.BLACK),
				Piece.Type.KNIGHT, Piece.KNIGHT_REPRESENTATION);
		verifyCreation(
				Piece.createBishop(Color.WHITE), Piece.createBishop(Color.BLACK),
				Piece.Type.BISHOP, Piece.BISHOP_REPRESENTATION);
		verifyCreation(
				Piece.createQueen(Color.WHITE), Piece.createQueen(Color.BLACK),
				Piece.Type.QUEEN, Piece.QUEEN_REPRESENTATION);
		verifyCreation(
				Piece.createKing(Color.WHITE), Piece.createKing(Color.BLACK),
				Piece.Type.KING, Piece.KING_REPRESENTATION);
		Piece blank = Piece.createNoPiece();
		assertEquals('.',blank.getRepresentation());
		assertEquals(Piece.Type.NO_PIECE, blank.getType());
	}

	private void verifyCreation(Piece whitePiece, Piece blackPiece,
		Piece.Type type, char representation) {
			assertTrue(whitePiece.isWhite());
			assertEquals(type, whitePiece.getType());
			assertEquals(representation, whitePiece.getRepresentation());
	
	assertTrue(blackPiece.isBlack());
	assertEquals(type, blackPiece.getType());
	assertEquals(Character.toUpperCase(representation),
			blackPiece.getRepresentation());
	}

}

