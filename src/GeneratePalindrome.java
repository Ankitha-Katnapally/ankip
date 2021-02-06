import java.util.Scanner;

public class GeneratePalindrome {
	static int reverseNumber(int num) {
        int reverse = 0;
        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            reverse = (reverse*10) + rem;
            num = num/10;
        }  
        return reverse;
    }
    static boolean getPalindromeList(int number){
    
        int reverse = reverseNumber(number);
        if(reverse == number) {
            return true;
        }
        else {
            return false;
        }
    }
    static void reverseAndAdd(int number) {
        if(getPalindromeList(number)) {
            System.out.println("Given Number is already a palindrome");
        }
        else{
            while (!getPalindromeList(number)) {
                int reverse = reverseNumber(number);
                int sum = number + reverse;
               System.out.print(number+" "+reverse+" "); 
                number = sum;
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int inputNumber = scan.nextInt(); 
        reverseAndAdd(inputNumber);

 

    }

}
