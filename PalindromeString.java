package Methods;

import java.util.Scanner;

public class PalindromeString {
	public static void palindrome(String str) {
		String originalWord=str;
		String reversedWord= "";
		for(int i=str.length()-1; i>=0;i--) {
			reversedWord=reversedWord+str.charAt(i);
		}
		if(originalWord.equals(reversedWord)) {
			System.out.println(originalWord+" is palindrome");
		}
		else {
			System.out.println(originalWord+" is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to check it it palindrome or not");
		String str=sc.nextLine();
		palindrome(str);
		

	}

}
