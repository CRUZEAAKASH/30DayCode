import java.util.Scanner;

public class Day6_LetsReview {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for (int i = 0; i < input; i++) {
			String s = scanner.next();
			for (int j = 0; j < s.length(); j += 2) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
			for (int k = 1; k < s.length(); k += 2) {
				System.out.print(s.charAt(k));
			}
			System.out.println("");
		}
	}
}
