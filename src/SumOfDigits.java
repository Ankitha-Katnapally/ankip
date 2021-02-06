import java.util.Scanner;

public class SumOfDigits {
	static void sumOfDigits(int num) {
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
			num= num / 10;
		}
			System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a  number");
		sumOfDigits(scan.nextInt());
	}

}
