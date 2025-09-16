package pack;

import java.util.Scanner;

public class ConditionalLogicwithJava1_Nacaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Discount Ammount:");
		
		double Amount = sc.nextDouble();
		
		double discount;
		double finalAmount;
		
		 if (Amount >= 100) {
	            discount = Amount * 0.20; 
	        } else if (Amount >= 50 && Amount <= 99.99) {
	            discount = Amount - (Amount * 0.10); 
	        } else {
	            discount = 0;
	        }

	finalAmount = Amount - discount;
	
	System.out.println("Purchase Amount: " + Amount);
    System.out.println("Discount: " + discount);
    System.out.println("Final Amount to Pay: " + finalAmount);

	}

}
