package com.operator;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("Voter is Eligible for voting");
		}
		else {
			System.out.println("Voter is Not eligible for voting");
		}
		
		

	}

}
