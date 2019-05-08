package anasgeme.geme;

import java.util.*;

public class App {
	public static void main(String[] args) {

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

		do

		{
			System.out.println("firstnumber");
			firstnumberd = y.nextDouble();

			System.out.println("secondnumber");
			secondnumberd = y.nextDouble();

			System.out.println("select account type : ¨ + ¨ - ¨ * ¨ / ¨ ");
			System.out.println("+ = 1");
			System.out.println("- = 2 ");
			System.out.println("* = 3");
			System.out.println("/ = 4 ");

			cd = y.nextInt();

			switch (cd) {

			case 1:
				System.out.println(firstnumberd + secondnumberd);
				break;
			case 2:
				System.out.println(firstnumberd - secondnumberd);
				break;
			case 3:
				System.out.println(firstnumberd * secondnumberd);
				break;
			case 4:
				System.out.println(firstnumberd / secondnumberd);
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
					System.out.println("You are out of the program now !");
					System.out.println("enter number to continue enter number to continue");
					break;
				}

				else if (v < z) {
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

}
