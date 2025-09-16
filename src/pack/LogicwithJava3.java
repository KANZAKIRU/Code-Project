package pack;

import java.util.Scanner;

public class LogicwithJava3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        
	        boolean result = (number % 4 == 0 && number % 100 != 0) || (number % 400 == 0);

	        if (result) {
	            System.out.println("The number satisfies the condition.");
	        } else {
	            System.out.println("The number does NOT satisfy the condition.");
	        }

	        sc.close();
	    }

	}
