package com.operator;

import java.util.Scanner;

public class VowelConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter alphabet: ");
char ch =sc.next().charAt(0);
if(ch=='a'|| ch =='e' ||ch=='i' ||ch=='o' ||ch=='u') {
	System.out.println(ch + " is an vowel");
}
else {
	System.out.println(ch+ " is an consonent");
}
	}

}
