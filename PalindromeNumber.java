package Methods;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void palindrome(int num) {
		int originalNumber=num;
		int reverseNumber=0;
		while(num!=0) {
			int lastDigit=num%10;
			reverseNumber= reverseNumber*10+lastDigit;
			num=num/10;
		}
		if(originalNumber==reverseNumber) {
			System.out.println(originalNumber+ " is palindrome");
		}
		else {
			System.out.println(originalNumber + " is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check palindrome or not");
		int n=sc.nextInt();
		palindrome(n);
		
		
		

	}

}
