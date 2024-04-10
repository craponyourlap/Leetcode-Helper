package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InputProcessor {
	private static class InputException extends Exception{
		
	}
	public static List<String> inputToTokens(String input) {
		// TODO Auto-generated method stub
		/* input will never contain carriage return or new line due to the nature of the method
		 * Scanner.nextLine()
		 * */
		String[] inputSplit = input.split("\\s+(?![^\\[]*\\\"[^\\[]*\\\"])(?![^\\[]*\\'[^\\[]*\\')");
		return Arrays.asList(inputSplit);
	}
	public static void validateTokens(List<String> tokens) {
		for (String token : tokens) {
			if (tokenContains(token, '\''))System.out.println("ok");	
		}
	}
	private static boolean tokenContains(String token, char c) {
		// TODO Auto-generated method stub
		for (char ch : token.toCharArray()) {
			if (ch == c)return true;
		}
		return false;
	}
}
