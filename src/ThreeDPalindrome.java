import java.util.Scanner;

public class ThreeDPalindrome {
	static int temp , rev = 0 , rem;
	static void menu() {
		String m = " ";
		m += "1.Integer\n";
		m += "2. String \n";
		m += " select any option";
		System.out.println(m);
	}
	static void accept() {
		System.out.println("enter a number");
	}
	
	static void accept1() {
		System.out.println("enter a string");
	}
	
	static void Integer(int x) {
		if(x != 0){
			temp = x;
			palindrome(x);	
			if(rev == temp) {
				System.out.println(" is a palindrome");
			}
			else {
				System.out.println(" not a palindrome");
			
			}
		}
		else {
			System.out.println("enter valid number");
		}
		
	}
	
	static void palindrome(int x) {
		if(x>0) {
		rem= x % 10;
        rev= rev * 10 + rem;
        x=x/10;	
		palindrome(x);
		}
	}
	
	static boolean StringPal(String str) {
		
		int i = 0, j = str.length()-1;
		if(str.charAt(i) != str.charAt(j)) {
			i++;
			j--;
			return false;
		}
		return true;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				accept();
				int x = sc.nextInt();
				Integer(x);
			case 2 :
				
				String str = "Ankitha";
				StringPal(str);
				if(StringPal(str)) {
					System.out.println("is palindrome");
				}
				else {
					System.out.println("not palindrome");
					
				}
			}
			
		System.out.println();
		
	}

}

