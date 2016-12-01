package pieces;

import junit.framework.TestCase;
import pieces.Piece;

import pieces.Piece.Color;
import pieces.Piece.Representation;


public class PieceTest extends TestCase {
	public void testPieceCreate() {
		verifyCreation(
				Piece.createPawn(Color.WHITE), Piece.createPawn(Color.BLACK),
				Piece.Type.PAWN, Piece.Representation.PAWN, Piece.PAWN_SCORE);
		verifyCreation(
				Piece.createRook(Color.WHITE), Piece.createRook(Color.BLACK),
				Piece.Type.ROOK, Piece.Representation.ROOK, Piece.ROOK_SCORE);
		verifyCreation(
				Piece.createKnight(Color.WHITE), Piece.createKnight(Color.BLACK),
				Piece.Type.KNIGHT, Piece.Representation.KNIGHT, Piece.KNIGHT_SCORE);
		
		verifyCreation(
				Piece.createBishop(Color.WHITE), Piece.createBishop(Color.BLACK),
				Piece.Type.BISHOP, Piece.Representation.BISHOP, Piece.BISHOP_SCORE);
		verifyCreation(
				Piece.createQueen(Color.WHITE), Piece.createQueen(Color.BLACK),
				Piece.Type.QUEEN, Piece.Representation.QUEEN, Piece.QUEEN_SCORE);
		verifyCreation(
				Piece.createKing(Color.WHITE), Piece.createKing(Color.BLACK),
				Piece.Type.KING, Piece.Representation.KING, Piece.KING_SCORE);
		Piece blank = Piece.createNoPiece();
		assertEquals('.',blank.representation.getRepresentation());
		assertEquals(Piece.Type.NO_PIECE, blank.getType());
		Piece piece = Piece.createPawn(Color.WHITE);
		assertEquals(Piece.PAWN_SCORE, piece.getMessage(Piece.Type.PAWN));
		Piece testBlackPawn = Piece.createPawn(Color.BLACK);
		assertEquals('P', testBlackPawn.representation.getRepresentation());
	}

	private void verifyCreation(Piece whitePiece, Piece blackPiece,
		Piece.Type type, Representation representation, double score) {
			assertTrue(whitePiece.isWhite());
			assertEquals(type, whitePiece.getType());
		//	assertEquals(representation, whitePiece.representation.getRepresentation());
			assertTrue(blackPiece.isBlack());
			assertEquals(type, blackPiece.getType());
			// assertEquals(representation,
			// blackPiece.representation.getRepresentation());
			assertEquals(whitePiece.getScore(), score);
	}
}

