import java.util.Scanner;

public class Lcm {
	static int lcmof(int a , int b) {
		int lcm = (a > b) ? a : b;
        int k = -1;
	    if( a > 0 && b > 0) {
	    while(true) {
	      if( lcm % a == 0 && lcm % b == 0 ) {
	        k = lcm;
	        break;
	      }
	      ++lcm;
	    }
	    }
	    if( a < 0 || b < 0) {
	    	k = -1;
	    }
	    return k;
	  }

		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int z = lcmof(a , b);
		System.out.println(z);
	}

}
