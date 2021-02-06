import java.util.Scanner;

public class Charcount {
	static void occurance(String s) {
		
		int count[] = new int[256];
		
		char ch[] = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) 
			count[s.charAt(i)]++; 
		for( int i = 0 ; i < s.length() ; i++) {
			ch[i] = s.charAt(i);
			int flag = 0;
			for( int j = 0 ; j <= i ; j++) {
				if(s.charAt(i) == ch[j]) {
					flag++ ;
			}
			}	
			if(flag == 1)
			System.out.println(" occurance of "+s.charAt(i)+" is "+count[s.charAt(i)]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "ankitha";
		occurance(str);
		
	}

}
