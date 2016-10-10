package chess;

import junit.framework.TestCase;


public class CharacterTest extends TestCase {

	public void testWhitespace(){
			char space = ' ';
			assertTrue(Character.isWhitespace(space));	
			char javaIdentifier = '^';
			assertTrue(Character.isJavaIdentifierPart(javaIdentifier));
			
	}
	
}
