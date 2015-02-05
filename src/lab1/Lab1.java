package lab1;

import java.util.Scanner;

public class Lab1 {
	
	public static void main(String[] args) {
		String name = "qwerty";
		
		System.out.println("Please enter the passcode");
		Scanner s = new Scanner (System.in);
		String user_input = s.next();
		if(user_input == name){
			System.out.println("Yay you guessed it");
		}
		else{
			System.out.println("Sorry thats not correct");
		}
		
		
	}
	
}
