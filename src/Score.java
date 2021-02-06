import java.util.Scanner;

public class Score {
	static int score(String s) {
		int score = 0 , index = 0;
		for (int i = 0 ; i < s.length() ; i++) {
			score += s.charAt(i)-'a'+1;	
		}
		return score;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String s = sc.nextLine().toLowerCase();
		int score = score(s);
		System.out.println(score);
	}

}
