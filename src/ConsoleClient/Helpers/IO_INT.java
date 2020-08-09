package ConsoleClient.Helpers;

import java.util.Scanner;

public class IO_INT {
	
	public static int inputInt(String note, int min, int max) {
		
		
		boolean condition = false;
		int result = 0;
		do {
			IO_String.outputString(note);
			Scanner scanner = new Scanner(System.in);
			int input = Integer.parseInt(scanner.nextLine());
			scanner.close();
			if (input >= min && input <= max) {
				condition = true;
			} else condition = false;
			if(condition) {
				result = input;
				break;
			}
			
		} while(!condition);
		return result;
		
	}
	
	public static int inputInt(String note) {
		boolean condition = false;
		int result = 0;
		do {
			IO_String.outputString(note);
			Scanner scanner = new Scanner(System.in);
			int input = Integer.parseInt(scanner.nextLine());
			scanner.close();
			
			if(condition) {
				result = input;
				break;
			}
			
		} while(!condition);
		return result;
	}
}
