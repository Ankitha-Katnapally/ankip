import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine().toLowerCase();
		String m[] = str.split(" ");
		for(String x : m) {
			StringBuffer br = new StringBuffer(x);
			String rev = br.reverse().toString();
			String firstletter = rev.substring(0 , 1).toUpperCase();
			String remletter = rev.substring(1 , rev.length());	
			rev = firstletter + remletter;
			System.out.print(rev+ " ");
			
			
		}
	}

}
