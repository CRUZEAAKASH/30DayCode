import java.util.Scanner;

public class Day2_Operators {
	// Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double cost=meal_cost/100;
        double tip = cost*tip_percent;
        double tax = cost*tax_percent;
        int total = (int)(Math.round(meal_cost+tip+tax));
        System.out.print(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
