import java.util.Scanner;

public class Day10_BinaryNumber {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int remainder = 0, temp_count = 0, final_count = 0;
	        while(n>0){
	            remainder = n%2;
	            n/=2;
	            if(remainder==1){
	                temp_count++;
	                if(temp_count>=final_count){
	                    final_count = temp_count;
	                }
	            }else{
	                temp_count = 0;
	            }
	        }
	        System.out.print(final_count);
	        scanner.close();
	    }
}
