package allTest;

import junit.framework.TestSuite;
import chess.BoardTest;
import chess.CharacterTest;
import pieces.PieceTest;
import util.StringUtilTest;

public class AllTests{
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(PieceTest.class);
		suite.addTestSuite(CharacterTest.class);
		suite.addTestSuite(StringUtilTest.class);
		return suite;
	}
}