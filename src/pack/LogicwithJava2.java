package pack;

import java.util.Scanner;

public class LogicwithJava2_Nacaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        System.out.print("Do you have a valid ticket? (true/false): ");
	        boolean hasTicket = sc.nextBoolean();
	      

	        boolean canEnter;

	        if (age >= 18) {
	        
	            canEnter = true;
	        } else if (age <= 18) {
	        	
	        	canEnter = hasTicket;

	        } else {
	            
	            canEnter = hasTicket;
	        }

	        
	        if (canEnter) {
	            System.out.println("You are allowed to enter.");
	        } else {
	            System.out.println("You are not allowed to enter.");
	        }

	        sc.close();
	    }
	}