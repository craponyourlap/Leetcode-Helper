package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InputProcessor {
	public static class InputException extends Exception{
		public InputException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	}
	public static List<String> inputToTokens(String input) {
		// TODO Auto-generated method stub
		/* input will never contain carriage return or new line due to the nature of the method
		 * Scanner.nextLine()
		 * */
		String[] inputSplit = input.split("\\s+(?![^\\[]*\\\"[^\\[]*\\\"])(?![^\\[]*\\'[^\\[]*\\')");
		return Arrays.asList(inputSplit);
	}
	public static void validateTokens(List<String> tokens) throws InputException {
		for (String token : tokens) {
			if (tokenContainsQuotationMarks(token) ||
				!tokenStartAndEndWithQuotes(token)) throw new InputException("Invalid token.");
		}
	}
	private static boolean tokenStartAndEndWithQuotes(String token) {
		// TODO Auto-generated method stub
		return tokenStartsWithQuotes(token) && tokenEndsWithQuotes(token);
	}
	private static boolean tokenEndsWithQuotes(String token) {
		// TODO Auto-generated method stub
		int l = token.length()-1;
		char c = token.charAt(l);
		return c == '\'' || c == '\"';
	}
	private static boolean tokenStartsWithQuotes(String token) {
		// TODO Auto-generated method stub
		char c = token.charAt(0);
		return c == '\'' || c == '\"';
	}
	private static boolean tokenContainsQuotationMarks(String token) {
		// TODO Auto-generated method stub
		return tokenContains(token, '\'') || tokenContains(token, '\"');
	}
	private static boolean tokenContains(String token, char c) {
		// TODO Auto-generated method stub
		for (char ch : token.toCharArray()) {
			if (ch == c)return true;
		}
		return false;
	}
}
