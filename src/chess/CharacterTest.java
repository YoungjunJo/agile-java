package chess;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {

	public void testWhitespace(){
			char space = ' ';
			assertTrue(Character.isWhitespace(space));	
			char javaIdentifier = 'A';
			assertTrue(Character.isJavaIdentifierPart(javaIdentifier));
	}
	
}
