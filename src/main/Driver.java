package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter string");
		String input = in.nextLine();
		List<String> tokens = InputProcessor.inputToTokens(input);
		System.out.println(tokens);
		InputProcessor.validateTokens(tokens);
		
	}

}
