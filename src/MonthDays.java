import java.util.Scanner;

public class MonthDays {
	static int match (String m[] , int days[] , String str ) {
	
	    int k = 0;
		for(int i = 0 ; i < m.length ; i++) {
			if(str.equals(m[i])) {
                k = i;
	        }
			
		}
		return k;
	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String m[] = { null , "JAN" , "FEB" , "MAR" , "APR" , "MAY" , "JUN" , "JUL" , "AUG" , "SEP" ,  "OCT" , "NOV" ,"DEC" };
		int days[] = { 0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31  };
		System.out.println("enter a month");
		String str = sc.nextLine().toUpperCase();
		int k =	match(m , days , str);
		System.out.println("days are "+days[k]);
	}
}

		


