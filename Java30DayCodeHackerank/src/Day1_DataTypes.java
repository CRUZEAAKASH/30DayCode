import java.util.Scanner;

public class Day1_DataTypes {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int second;
		double d2;
		String s2;
		/* Read and save an integer, double, and String to your variables. */
		second = scan.nextInt();
		d2 = scan.nextDouble();
		scan.nextLine();
		s2 = scan.nextLine();
		// System.out.println("second string="+s2);
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + second);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + d2);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.print(s + s2);
		scan.close();
	}
}
