package main;

import java.util.Scanner;

public class TextManagement {
	public static String intToString (int integer) {
		String string = String.valueOf(integer);
		return string;
	}
	
	public static void printPhrase(String string) {
        System.out.println(string);
    }
	
	public static String getPhrase() {
		Scanner scanner = new Scanner( System.in );
		String input = scanner.nextLine();
		return input;
	}
}
