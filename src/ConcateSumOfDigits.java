import java.util.Scanner;

public class ConcateSumOfDigits {
	static String concatesum(double d) {
		String res =" ";
		String s = String.valueOf(d);
		s = s.replace(".", ",");
		String[] str = s.split(",");
		int str1[] = new int[str.length];
		for( int i = 0 ; i < str.length ; i++) {
			str1[i] = Integer.parseInt(str[i]);
		}
		for( int i = 0 ; i < str1.length ; i++) {
			res += sumofdigits(str1[i]);
			if( i == str1.length-1) {
				res += " ";
			}
			else {
				res += ":";
			}
		}
		return res;
		
	}
	static int sumofdigits(int x) {
	

		int sum = 0; 
		while(x != 0) {
			sum = sum + x%10;
			x = x/10;		
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a decimal");
		double d = sc.nextDouble();
		System.out.println(concatesum(d));
		

	}

}
