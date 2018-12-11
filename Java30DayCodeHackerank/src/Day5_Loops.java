import java.util.Scanner;

public class Day5_Loops {
	private static final Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + i * n);
		}
	}
}
