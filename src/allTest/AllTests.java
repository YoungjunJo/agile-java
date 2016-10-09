package allTest;

import junit.framework.TestSuite;
import chess.BoardTest;
import pieces.PawnTest;

public class AllTests{
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(PawnTest.class);
		return suite;
	}
}