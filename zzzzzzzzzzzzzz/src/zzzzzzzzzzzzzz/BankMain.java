//HEY IT'S ME BOSSKCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC

package zzzzzzzzzzzzzz;

import java.util.Scanner;
	
public class BankMain {
	
	private static String msgAuthenticationError;
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
			
		do {
			System.out.print("Enter username: ");
			String userName = scan.nextLine();
			System.out.print("Enter PIN: ");
			String userPin = scan.nextLine();
			if(isValidUser(userName) && isValidPin(userPin)) {
				msgAuthenticationError = "---Username and PIN accepted. Thank you---";
				System.out.println("\n" + msgAuthenticationError);
			}else {
				msgAuthenticationError = "---Invalid Username Or PIN. Please try again Thank you!---";
				System.out.println("\n" + msgAuthenticationError);
			}
			
		}while(msgAuthenticationError.equals("---Invalid Username Or PIN. Please try again Thank you!---"));
		
		
	 
	}//end of main method
	
//	-----------------------isValidPin Method Start-----------------------------
	public static boolean isValidPin(String pin) {
		int numCount = 0;
		int letterCount = 0;
		int unwantedCharCount = 0;
		
		for(int i = 0; i < pin.length(); i++) {
			if(containLetter(pin.charAt(i))) {
				letterCount++;
			}
			if(containNumber(pin.charAt(i))) {
				numCount++;
			}
			if(containUnwantedChar(pin.charAt(i))) {
				unwantedCharCount++;
			}
		}
		
		return(numCount == 4 && letterCount == 0 && unwantedCharCount == 0);
		
	}
//	-----------------------isValidPin Method End-----------------------------
	
//	-----------------------isValidUser Method Start-----------------------------
	public static boolean isValidUser(String userName) {
		int numCount = 0;
		int letterCount = 0;
		int unwantedCharCount = 0;
		
		char charUserName [] = userName.toCharArray();
		for(int i = 0 ; i < userName.length(); i++) {
			if(containLetter(charUserName[i])) {
				letterCount++;
			}
			if(containNumber(charUserName[i])) {
				numCount++;
			}
			if(containUnwantedChar(charUserName[i])) {
				unwantedCharCount++;
			}
		}
		
		
		return(letterCount >= 3 && numCount == 0 && unwantedCharCount == 0);
			
	}
//	-----------------------isValidUser Method End------------------------------
	
	
	public static boolean containNumber(char input) {
		return(input >= '0' && input <= '9');
	}
	public static boolean containLetter(char input) {
		return((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'));
	}
	public static boolean containUnwantedChar(char input) {
		return(input >= ':' && input <= '@');
	}

}//end of main class




