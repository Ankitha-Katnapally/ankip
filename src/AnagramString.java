import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	static boolean anagram(String str , String str1) {
		boolean b = false;
		char p[] = str.toCharArray();
		char p1[] = str1.toCharArray();
		Arrays.sort(p);
		Arrays.sort(p1);
		b = Arrays.equals(p, p1);
		if(b) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
		
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two strings");
		String str = sc.nextLine().toLowerCase();
		String str1 = sc.nextLine().toLowerCase();
		anagram(str , str1);
		
	}

}
