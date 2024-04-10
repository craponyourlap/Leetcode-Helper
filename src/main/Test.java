package main;

import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available");
            return;
        }
        System.out.println("Enter your password:");
        char[] passwordArray = console.readPassword();
        String password = new String(passwordArray);
        System.out.println("Password entered: " + password);
    }
}
