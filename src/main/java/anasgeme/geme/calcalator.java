package anasgeme.geme;

import java.util.Scanner;

public class calcalator {

	public static void main(String[] areg) {

		boolean restart = true;

		Scanner y = new Scanner(System.in);

		System.out.println("Hello");
		System.out.println("Iam Anas ");
		System.out.println("calculator works now");
		System.out.println("------------------------------------------------");

		double firstnumberd;
		double secondnumberd;
		int cd;
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

			Scanner x = new Scanner(System.in);
			int v, z;
			z = 999999;
			v = 0;
			System.out.println("Enter a 1 to continue ");
			System.out.println("Enter a 2 to exit");
			// System.out.println("Enter a another number to the end " );

			n = x.nextInt();

			switch (n) {

			case 1:
				restart = true;
				System.out.println("continue ok");
				System.out.println("enter number");
				break;

			case 2:
				if (2 > 1) {
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
					
				} else if (v < z) {
					System.out.println("The end");
					break;
				}

				else {
					System.out.println("enter number to continue");
					break;
				}
			default:
				System.out.println("input is incorrect");
				System.out.println("enter number to continue.");
			}
			n = x.nextInt();
			byte yes;
			byte no;
			int k = 1;
			int l = 2;
			yes = -1;
			no = -2;
			if (k >= yes) {
				restart = true;
			} else if (l <= no) {
				restart = false;
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

