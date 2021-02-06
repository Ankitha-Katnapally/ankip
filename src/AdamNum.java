import java.util.Scanner;

public class AdamNum {
	static int getReverse(int n ) {
		int k = 0;
		int temp , rev = 0 , rem;
		temp = n;
		while( temp != 0 ) {
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
	    k = rev;
	
		return k;
		
	}
	static boolean adam(int n ) {
		boolean b = false;
		int prod1 = n*n;
		int prod2 = getReverse(n)*getReverse(n);
		if(prod1 == getReverse(prod2)) {
			b = true;	
		}
		return b ;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println(adam(n));
	}

}
