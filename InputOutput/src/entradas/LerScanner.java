package entradas;

import java.util.Scanner;

public class LerScanner {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter username");
		String userName = myObj.nextLine();
		
		System.out.println("Enter your age");
		Integer age = myObj.nextInt();
		
		System.out.println("username is: " + userName + " and your age: " + age);
	}
}
