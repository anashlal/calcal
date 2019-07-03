package anasgeme.geme;

import java.util.Scanner;

public class calcalator {

	public static void main(String[] areg) {

		boolean restart = true;

		@SuppressWarnings("resource")
		Scanner y = new Scanner(System.in);

		System.out.println("Hello");
		System.out.println("Iam Anas ");
		System.out.println("calculator works now");
		System.out.println("------------------------------------------------");

		double firstnumberd;
		double secondnumberd;
		
		int n;
		String r;
		double result;
		do {
			System.out.println("firstnumber");
			firstnumberd = y.nextDouble();

			System.out.println("secondnumber");
			secondnumberd = y.nextDouble();

			System.out.println("select account type : � + � - � * � / � ");
			System.out.println(" + ");
			System.out.println(" - ");
			System.out.println(" * ");
			System.out.println(" / ");

			r = y.next();

			switch (r) {

			case "+":
				result = Add(firstnumberd, secondnumberd);
				System.out.println(" the result is : " + result);
				break;
			case "-":
				result = minus(firstnumberd, secondnumberd);
				System.out.println(" the result is : " + result);
				break;
			case "*":
				result = mult(firstnumberd, secondnumberd);
				System.out.println(" the result is : " + result);
				break;
			case "/":
				result = dived(firstnumberd, secondnumberd);
				System.out.println(" the result is : " + result);
				
				break;

			default:
				System.out.println("the end program");
			}

			@SuppressWarnings("resource")
			Scanner x1 = new Scanner(System.in);
			
			System.out.println("Enter a 1 to continue ");
			System.out.println("Enter a 2 to exit");
			// System.out.println("Enter a another number to the end " );

			n = x1.nextInt();

			switch (n) {

			case 1:
				restart = true;
				System.out.println("continue ok");
				System.out.println("enter number");
				break;

			case 2:
				
					System.out.println("exit");
					restart = false;
					System.out.println("***************");
					System.out.println("*************");
					System.out.println("*********");
					System.out.println("*****");
					System.out.println("***");
					System.out.println("*");

					System.out.println("You are out of the program now !");
					System.out.println("enter number to continue ");
					break;
				}
		}

		while (restart);
	}

	public static double Add(double firstnumber, double secondnumber) {
		return firstnumber + secondnumber;
	}
	
	public static double dived (double firstnumber, double secondnumber) {
		return firstnumber / secondnumber;
	}
	public static double mult(double firstnumber, double secondnumber) {
		return firstnumber * secondnumber;
	}
	public static double minus(double firstnumber, double secondnumber) {
		return firstnumber - secondnumber;
	}
	
	
}

