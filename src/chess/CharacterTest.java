package chess;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {

	public void testWhitespace(){
			char ch1 = ' ';
			assertTrue(Character.isWhitespace(ch1));		
	}
	
}
