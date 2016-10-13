package util;

import junit.framework.TestCase;

public class StringUtilTest extends TestCase{
	public void testCreateNewLine(){
		System.out.println("CHESS");
		StringUtil.addNewLine();
		System.out.println("CHESS");
	}

}
