import java.util.Scanner;

public class SwapWithMethod {
	static void swap(int a , int b ) {
		a = a + b;
		b = a - b;
		a = a- b;
		System.out.println("after swapping a = "+a+" and b = "+b);
		
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2 numbers ");
	swap(sc.nextInt() , sc.nextInt());
	

}
}
