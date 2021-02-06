import java.util.Scanner;

public class OddPalindrome {
	static boolean oddPalindrome(int num) {
		  int reverse = 0,rem;
		    int temp = num;
		    while(num > 0) {
		    	rem = num % 10;
		    	reverse = (reverse * 10 )+ rem;
		    	num = num / 10;
		    }
		    
		    if (temp == reverse) {
		        return true;
		    }
		    else {
		        return false;
		    }
		}
		static void printPalindromes(int min, int max) {
		    for (int i = min; i <= max; i++) {
		        if (oddPalindrome(i)) {
		        	if(i % 2 != 0) {
		                 System.out.print(i+ " ");	
		        	}
		        }
		    }
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the numbers that is the start and end : ");
			int start = scan.nextInt();
			int end = scan.nextInt();
			printPalindromes(start, end);	

}

}
