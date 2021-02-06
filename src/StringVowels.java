import java.util.Scanner;

public class StringVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		String name = sc.nextLine().toUpperCase();
		String v = "AEIOU";
		String res = " ";
		for ( int i = 0 ; i < v.length() ; i++) {

			for( int j = 0 ; j < name.length() ; j++) {
				if( v.charAt(i) == name.charAt(j)) {
					res += name.charAt(j);	
				}
			}
		}
		
			System.out.println(res.toLowerCase()+ " ");
		}
	}



