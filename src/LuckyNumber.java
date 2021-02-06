import java.util.Scanner;

public class LuckyNumber {
	static int stringtonum(String s) {
		int k = 0;
		String str[] = {null , "jan" , "feb" , "mar" , "apr" , "may" , "jun" , "jul" , "aug" , "sep" , "oct" , "nov" , "dec"};
		for(int i = 0 ; i < str.length ; i++) {
		if(s.equals(str[i])) {
			k = i;
		}
		}
		return k;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month");
		String s = sc.nextLine().toLowerCase();
		int z = stringtonum(s);
		System.out.println("enter date");
		int n = sc.nextInt();
		
		System.out.println("enter year");
		int x = sc.nextInt();
		int sum = 0; int sum1 = 0; int sum2 = 0;
		while(n != 0) {
			sum = sum + n%10;
			n = n/10;		
		}
		while(z != 0) {
			sum = sum +z%10;
			z = z/10;			
		}
		while(x != 0) {	
			sum = sum + x%10;
			x = x/10;	
		}
		while(sum != 0) {
			sum1 += sum%10;
			sum = sum/10;
		}
		while(sum1 != 0) {
			sum2 += sum1%10;
			sum1 = sum1/10;
		}
		System.out.println(sum2);
	}

}
