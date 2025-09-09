package pack;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int operator, n1, n2;
		System.out.println("n1 - Add \n 2 - Substract \n 3 - Multiply \n4 Devide");
		System.out.println("Choose Operator: ");
		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();
		System.out.println("Input first number : ");
		n1 = sc.nextInt();
		System.out.println("Input second number : ");
		n2 = sc.nextInt();
		
		int result = 0;
		switch(operator) {
		case 1: 
			result = n1 + n2;
			break;
			
		case 2:
			result = n1 - n2;
			break;
			
		case 3:
			result = n1 * n2;
			break;
			
		case 4:
			result = n1 / n2;
			break;
			
			default:
				System.out.println("Inputed operator is not valid, Dumbass");
		}
		
		System.out.println("Result is : " + result);


	}

}

