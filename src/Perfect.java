import java.util.Scanner;

public class Perfect {
	static int perfect( int n) {
		int b = 0;
		if( n < 0 ) {
			b = -2;	
		}
		if( n == 0) {
			b = -3;
		}
		int sum = 1;
		if( n > 0 ) {
		for (int i = 2; i * i <= n; i++) 
	    { 
	        if (n % i == 0) 
	        { 
	            if(i * i != n) { 
	                sum = sum + i + n / i; 
	            }
	            else {
	                sum = sum + i; 
	            }     
	        }
	    } 
		if(sum == n) {
			b = 0;
		}
		else if (sum < n) {
			b = -1;
		}
		else if (sum > n) {
			b = 1;
		}
		}
		return b;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println(perfect(n));
		
		
	}

}
