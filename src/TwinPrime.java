import java.util.Scanner;

public class TwinPrime {
	
		static int twinPrime( int n) {
			 if(n == 1)
			    {
			        return 0;
			    }

			    for(int i = 2; i < n; i++)
			    {
			        if(n % i == 0)
			        {
			            return 0;
			        }
			    }
			    return 1;
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		
			int start, end;

		    System.out.println("Enter start: ");
		    start = scan.nextInt();
		    System.out.println("Enter end: ");
		    end = scan.nextInt();
		   
		    for(int i = start; i < end; i++)
		    {
		    	if(twinPrime(i) ==1 && twinPrime(i+2) == 1) {
					System.out.printf("(%d, %d)\n",i,i+2);
		    	}	
		    }    

		}

}
