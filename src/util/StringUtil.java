package util;

/**
 * Provides common utilities of a Chess Board
 * @author JYJ
 */

public class StringUtil {
	private StringUtil(){}
	public static final String NEWLINE = 
			System.getProperty("line.separator");
	/**
	 * Adding a NEWLINE
	 */
	public static void addNewLine(){
		System.out.println(NEWLINE);
	}
}
