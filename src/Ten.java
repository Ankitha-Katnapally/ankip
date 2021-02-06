import java.util.Scanner;

public class Ten {
	static boolean ten(int a, int b) {
		boolean x = false;
		if(a == 10 || b == 10 || a+b ==10){
			x = true;
		}
		return x;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		System.out.println(ten(sc.nextInt(),sc.nextInt()));
		
		
	}

}
