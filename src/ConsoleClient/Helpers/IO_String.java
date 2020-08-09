package ConsoleClient.Helpers;

import java.util.Scanner;

public class IO_String {
	public static void outputString(String Note) {
		System.out.println(Note);
	}
	
	public static String inputString(String Note) {
		boolean condition = false;
		String result;
		
		do {
			outputString(Note);
			Scanner sc = new Scanner(System.in);
			result = sc.nextLine();
			if(result.trim() != "") {
				condition = true;
			} else condition = false;
			if(!condition) {
				System.out.println("Nhập sai, mời nhập lại");
			}
		} while(!condition);
		return result;
			
	}
}
